package org.leetcode.graphs;

import java.util.*;

public class MinimumNumberOfVerticesToReachAllNodes {

    private Map<Integer, List<Integer>> graph = new HashMap<>();
    private boolean[] seen;

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {

        seen = new boolean[n];

        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());

        }

        for (List<Integer> edge : edges) {
            graph.get(edge.getFirst()).add(edge.getLast());
        }
        for (int i = 0; i < n; i++) {
            if (!seen[i]) {
                dfs(i);
            }

        }
        return new ArrayList<>(graph.keySet());
    }

    private void dfs(int node) {
        for (Integer i : graph.get(node)) {

            if (!seen[i]) {
                seen[i] = true;
                dfs(i);
                graph.remove(i);
            }
        }
    }

}
