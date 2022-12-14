package org.leetcode.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class NearestExitFromEntranceInMaze {

    private int m;
    private int n;
    private final int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int nearestExit(char[][] maze, int[] entrance) {

        m = maze.length;
        n = maze[0].length;

        boolean[][] seen = new boolean[m][n];
        Queue<State> queue = new LinkedList<>();

        queue.add(new State(entrance[0], entrance[1],0));
        seen[entrance[0]][entrance[1]] = true;

        while (!queue.isEmpty()) {

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                State state = queue.remove();

                for (int [] c: directions) {
                    State current = new State(state.row + c[0], state.col + c[1], state.step + 1);

                    if (atTheBorder(current.row, current.col, state.step)){
                        return state.step;
                    }
                    if (!valid(current.row, current.col, seen) || maze[current.row][current.col] == '+') continue;
                    seen[current.row][current.col] = true;
                    queue.add(current);
                }
            }
        }
        return -1;
    }

    public boolean atTheBorder(int row, int col, int step) {
        return (0 > row || row >= m || 0 > col || col >= n) && step > 0;
    }
    public boolean valid(int row, int col, boolean[][] mat) {
        return 0 <= row && row < m && 0 <= col && col < n && !mat[row][col];
    }
    class State {

        int row;
        int col;
        int step;

        State(int row, int col, int steps) {
            this.row = row;
            this.col = col;
            this.step = steps;
        }
    }
}
