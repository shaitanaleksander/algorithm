package org.leetcode.graphs;

import java.util.*;

public class RottingOranges {


    int[][] matrix = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    public int orangesRotting(int[][] grid) {


        Queue<List<Integer>> rotten = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) rotten.offer(List.of(i, j));
            }
        }


        int result = -1;

        while (!rotten.isEmpty()) {
            result++;
            System.out.println(rotten);
            int size = rotten.size();
            for (int i = 0; i < size; i++) {

                List<Integer> orange = rotten.remove();

                for (int[] node : matrix) {
                    int x = orange.get(0) + node[0];
                    int y = orange.get(1) + node[1];

                    if (valid(new int[]{x, y}, grid)) {
                        grid[x][y] = 2;
                        rotten.add(List.of(x, y));
                    }
                }

            }

        }

        int left = 0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt == 1) left++;
            }
        }
        return left == 0 ? result == -1? 0:result : -1;
    }

    private boolean valid(int[] fruit, int[][] grid) {
        return 0 <= fruit[0] && fruit[0] < grid.length && 0 <= fruit[1] && fruit[1] < grid[0].length && grid[fruit[0]][fruit[1]] == 1;
    }


    public static void main(String[] args) {
        RottingOranges rottingOranges = new RottingOranges();
        int[][] arr = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};

        int i = rottingOranges.orangesRotting(arr);
        System.out.println(i);
    }
}
