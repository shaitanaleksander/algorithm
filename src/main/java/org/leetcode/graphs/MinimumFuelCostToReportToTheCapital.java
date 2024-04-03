package org.leetcode.graphs;

import java.util.*;

public class MinimumFuelCostToReportToTheCapital {

    private Map<Integer, List<Integer>> graph = new HashMap<>();
    private long result = 0;

    public long minimumFuelCost(int[][] roads, int seats) {

        for (int i = 0; i < roads.length + 1; i++) graph.put(i, new ArrayList<>());

        for (int[] road : roads) {
            graph.get(road[0]).add(road[1]);
            graph.get(road[1]).add(road[0]);
        }

        for (Integer node : graph.get(0)) {
             dfs(node, 0, seats);
        }

        return result;
    }

    private int dfs(int node, int parent, int seats) {

        List<Integer> nodes = graph.get(node);
        int passages = 1;

        for (Integer i : nodes) {
            if (i != parent){
                passages += dfs(i, node, seats);
            }
        }
        result += Math.ceil((double) passages / seats);
        return passages;
    }

}
