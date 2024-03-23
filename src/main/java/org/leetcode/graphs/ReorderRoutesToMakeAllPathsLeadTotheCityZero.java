package org.leetcode.graphs;

import java.util.*;

public class ReorderRoutesToMakeAllPathsLeadTotheCityZero {

    private Map<Integer, List<int[]>> adj = new HashMap<>();
    int result = 0;

    public int minReorder(int n, int[][] connections) {
        for (int[] connection : connections) {
            adj.computeIfAbsent(connection[0], k -> new ArrayList<>())
                    .add(new int[]{connection[1], 1});

            adj.computeIfAbsent(connection[1], k -> new ArrayList<>())
                    .add(new int[]{connection[0], 0});
        }

        dfs(0, -1);
        return result;
    }

    private void dfs(int node, int parent) {
        if (!adj.containsKey(node)) return;

        for (int[] arr : adj.get(node)) {
            if (arr[0] != parent) {
                result += arr[1];
                dfs(arr[0], node);
            }
        }
    }

    public static void main(String[] args) {
        ReorderRoutesToMakeAllPathsLeadTotheCityZero task = new ReorderRoutesToMakeAllPathsLeadTotheCityZero();

        int[][] arr = new int[][]{{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};
        int i = task.minReorder(6, arr);
        System.out.println(i);
    }
}
