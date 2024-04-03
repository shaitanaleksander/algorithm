package org.leetcode.graphs;

import java.util.Arrays;

public class MaximalNetworkRank {

    public static int maximalNetworkRank(int n, int[][] roads) {

        if (roads.length == 0) return 0;
        int[] counter = new int[n];
        int[][] connected = new int[n][n];

        for (int[] road : roads) {
            counter[road[0]]++;
            counter[road[1]]++;

            connected[road[0]][road[1]] = 1;
            connected[road[1]][road[0]] = 1;
        }


        int result = 0;

        for (int i = 0; i < counter.length; i++) {
            for (int j = i + 1; j < counter.length; j++) {
                result = Math.max(result, counter[i] + counter[j] + connected[i][j]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{0, 1}, {0, 3}, {1, 2}, {1, 3}};

        maximalNetworkRank(4, arr);
    }
}
