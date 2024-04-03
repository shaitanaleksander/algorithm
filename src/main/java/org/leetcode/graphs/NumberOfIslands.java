package org.leetcode.graphs;

public class NumberOfIslands {

    private int mrows;
    private int mcolumns;

    private int[][] path = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};


    public int numIslands(char[][] grid) {

        mrows = grid.length;
        mcolumns = grid[0].length;

        int result = 0;

        boolean[][] seen = new boolean[mrows][mcolumns];

        for (int row = 0; row < mrows; row++) {
            for (int column = 0; column < mcolumns; column++) {
                if (grid[row][column] == '1' && !seen[row][column]) {
                    seen[row][column] = true;
                    result++;
                    dfs(row, column,grid, seen);
                }
            }
        }
        return result;
    }

    private void dfs(int row, int column, char[][] grid, boolean[][] seen) {
        for (int[] p : path) {
            int nextRow = row + p[0];
            int nextColumn = column + p[1];
            if (valid(nextRow, nextColumn) && grid[nextRow][nextColumn] == '1' && !seen[nextRow][nextColumn]) {
                seen[nextRow][nextColumn] = true;
                dfs(nextRow, nextColumn, grid, seen);
            }

        }
    }

    private boolean valid(int row, int column) {
        return row >= 0 && row < mrows && column >= 0 && column < mcolumns;
    }
}
