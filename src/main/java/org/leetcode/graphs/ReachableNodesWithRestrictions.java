package org.leetcode.graphs;

import java.util.*;

public class ReachableNodesWithRestrictions {

    HashMap<Integer, List<Integer>> edgs = new HashMap<>();
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        Set<Integer> restrictedNodes = new HashSet<>();
        boolean[] nodes = new boolean[n];
        for (int i: restricted) {
            restrictedNodes.add(i);
        }

        for (int i = 0; i < edges.length ; i++) {
            if (restrictedNodes.contains(edges[i][1]) || restrictedNodes.contains(edges[i][0])) continue;
            edgs.computeIfAbsent(edges[i][0], s -> new ArrayList<Integer>()).add(edges[i][1]);
            edgs.computeIfAbsent(edges[i][1], s -> new ArrayList<Integer>()).add(edges[i][0]);
        }
        return deeper(0, nodes);
    }

    private int deeper(int node, boolean[] nodes) {
        int sum = 0;
        if (nodes[node]) return sum;
        if (!edgs.containsKey(node)) return 1;
        nodes[node] = true;

        for ( Integer n: edgs.get(node)) {
            sum += deeper(n, nodes);
        }
        return sum + 1;
    }


}