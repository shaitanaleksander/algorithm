package org.leetcode.graphs;

import java.util.*;

public class RedundantConnection {


    public int[] findRedundantConnection(int[][] edges) {

        List<Integer>[] connections = new List[1000];
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < connections.length; i++) connections[i] = new ArrayList<>();

        for (int[] edge : edges) {

            seen.clear();
            if (!connections[edge[0]].isEmpty()
                    &&
                    !connections[edge[1]].isEmpty()
                    &&
                    connected(connections, seen, edge[0], edge[1])
            ) {
                return edge;
            }
            connections[edge[0]].add(edge[1]);
            connections[edge[1]].add(edge[0]);
        }
        return new int[2];
    }

    private boolean connected(List<Integer>[] connections, Set<Integer> seen, int node, int target) {

        if (!seen.contains(node)) {
            seen.add(node);
            if (node == target) return true;
            for (Integer connection : connections[node]) {
                if (connected(connections, seen, connection, target)) return true;
            }
        }

        return false;
    }
}
