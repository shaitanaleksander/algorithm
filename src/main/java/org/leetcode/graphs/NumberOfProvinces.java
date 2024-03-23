package org.leetcode.graphs;

import java.util.*;

public class NumberOfProvinces {

    private HashSet<Integer> seen = new HashSet<>();
    private Map<Integer, List<Integer>> graph = new HashMap<>();

    public int findCircleNum(int[][] isConnected) {

        int result = 0;
        for (int i = 0; i < isConnected.length; i++) {

            if (!graph.containsKey(i)) {
                graph.put(i, new ArrayList<>());
            }

            for (int j = i + 1; j < isConnected.length; j++) {
                if (!graph.containsKey(j)) {
                    graph.put(j, new ArrayList<>());
                }
                if (isConnected[i][j] == 1) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
            if (!seen.contains(entry.getKey())) {
                result++;
                seen.add(entry.getKey());
                dfs(entry.getValue());
            }
        }
        return result;
    }

    private void dfs(List<Integer> nodes) {
        for (Integer node : nodes) {
            if (!seen.contains(node)) {
                seen.add(node);
                dfs(graph.get(node));
            }
        }
    }
}
