package org.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 1, 0}, {1,1,0}, {0,0,1}};

        System.out.println(dosomething(arr));

    }

    private static Map<Integer, List<Integer>> graph = new HashMap<>();
    private static boolean[] seen;

    private static int dosomething(int[][] isConnected) {

        int n = isConnected.length;
        for (int i = 0; i < n; i++) {
            if (!graph.containsKey(i)) {
                graph.put(i, new ArrayList<>());
            }
            for (int j = i + 1; j < n; j++) {
                if (!graph.containsKey(j)) {
                    graph.put(j, new ArrayList<>());
                }
                if (isConnected[i][j] == 1) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        System.out.println(graph);

        seen = new boolean[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!seen[i]) {
                // add all nodes of a connected component to the set
                ans++;
                seen[i] = true;
                dfs(i);
            }
        }

        return ans;
    }


    public static void dfs(int node) {
        for (int neighbor : graph.get(node)) {
            if (!seen[neighbor]) {
                seen[neighbor] = true;
                dfs(neighbor);
            }
        }
    }
}