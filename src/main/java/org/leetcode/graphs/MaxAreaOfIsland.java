package org.leetcode.graphs;

import java.util.HashSet;
import java.util.Set;

public class MaxAreaOfIsland {


    private int m;
    private int n;
    private int islandSize = 0;

    private final Set<String> seen = new HashSet<>();
    private final int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};


    public int maxAreaOfIsland(int[][] grid) {

        int biggest = 0;

        m = grid.length;
        n = grid[0].length;

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                islandSize = 0;
                String hash = convertToHash(row, col);
                if (grid[row][col] == 1 && !seen.contains(hash)) {
                    islandSize++;
                    seen.add(hash);
                    dfs(row, col, grid);
                }
                biggest = Math.max(biggest, islandSize);
            }
        }
        return biggest;
    }

    public void dfs(int row, int col, int[][] grid) {
        for (int[] direction : directions) {
            int nextRow = row + direction[0], nextCol = col + direction[1];
            String hash = convertToHash(nextRow, nextCol);
            if (valid(nextRow, nextCol, grid) && !seen.contains(hash)) {
                seen.add(hash);
                islandSize++;
                dfs(nextRow, nextCol, grid);
            }
        }
    }

    public boolean valid(int row, int col, int[][] grid) {
        return 0 <= row && row < m && 0 <= col && col < n && grid[row][col] == 1;
    }

    public String convertToHash(int row, int col) {
        return String.valueOf(row) + "," + String.valueOf(col);
    }

}
