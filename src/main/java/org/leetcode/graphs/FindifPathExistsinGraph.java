package org.leetcode.graphs;

import java.util.*;

public class FindifPathExistsinGraph {

    private final Map<Integer, List<Integer>> graph = new HashMap<>();
    private final Set<String> paths = new HashSet<>();
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        if (edges.length == 0) return false ;

        for (int[] edge : edges) {
            int x = edge[0], y = edge[1];

            if (!graph.containsKey(x)){
                graph.put(x, new ArrayList<>());
            }
            graph.get(x).add(y);

            if (!graph.containsKey(y)){
                graph.put(y, new ArrayList<>());
            }
            graph.get(y).add(x);


        }
        System.out.println(graph);
        return dps(source, destination);
    }

    private boolean dps(int node, int destination) {

        for ( Integer n: graph.get(node)) {
            if (n == destination) return true;
            String edges = node + "," + n;
            if (!paths.contains(edges)){
                paths.add(edges);
                if (dps(n, destination)) {
                    return true;
                }
            }
        }
        return false;
    }
}
