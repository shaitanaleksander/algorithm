package org.leetcode.graphs;

import java.util.*;

public class NumberOfConnectedComponentsInAnUndirectedGraph {

    public int countComponents(int n, int[][] edges) {

        HashMap<Integer, List<Integer>> edgs = new HashMap<>();
        boolean[] visited = new boolean[n];
        int result = 0;
        for (int[] node: edges) {

            int a = node[0], b = node[1];
            edgs.computeIfAbsent(a, val -> new ArrayList<>()).add(b);
            edgs.computeIfAbsent(b, val -> new ArrayList<>()).add(a);
        }
        System.out.println(edgs);
        for (int i = 0; i < visited.length; i++) {
            if (visited[i]) continue;
            if (!edgs.containsKey(i)) {
                result++;
                continue;
            }
            Queue<Integer> queue = new LinkedList<>();
            queue.add(i);

            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int j = 0; j < size; j++) {
                    Integer node = queue.poll();
                    if (!edgs.containsKey(node)) {
                        result++;
                        continue;
                    }
                    if (visited[node]) continue;

                    visited[node] = true;
                    System.out.println(node);
                    queue.addAll(edgs.get(node));
                }
            }
            result++;
        }
        return result;
    }

}
