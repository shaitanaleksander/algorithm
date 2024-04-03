package org.leetcode.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WallAndGates {


    int[][] sides = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};


    public void wallsAndGates(int[][] rooms) {

        Queue<int[]> gates = new LinkedList<>();

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                if (rooms[i][j] == 0) gates.offer(new int[]{i,j});
            }
        }

        while (!gates.isEmpty()) {

            int size = gates.size();

            for (int i = 0; i < size; i++) {
                int[] node = gates.remove();
                int length = rooms[node[0]][node[1]];
                for (int[] side : sides) {

                    int x = node[0]+ side[0];
                    int y = node[1] + side[1];
                    if (valid(x, y, rooms)) {
                        rooms[x][y] = length + 1;
                        gates.offer( new int[]{x, y});
                    }
                }
            }
        }
    }

    private boolean valid(int x, int y, int[][] rooms) {
        return x >= 0 && x < rooms.length && y >= 0 && y < rooms[0].length && rooms[x][y] == Integer.MAX_VALUE;
    }
}
