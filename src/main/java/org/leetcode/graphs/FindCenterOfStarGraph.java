package org.leetcode.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCenterOfStarGraph {

    public int findCenter(int[][] edges) {
        int[] vault = new int[edges.length];

        for (int[] edge : edges) {
            if (vault[edge[0]] == 1) return edge[0];
            if (vault[edge[1]] == 1) return edge[1];
            vault[edge[0]]++;
            vault[edge[1]]++;
        }
        return 0;
    }

}
