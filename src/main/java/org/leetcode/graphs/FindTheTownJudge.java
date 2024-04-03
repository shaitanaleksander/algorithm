package org.leetcode.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheTownJudge {

    public int findJudge(int n, int[][] trust) {

        boolean[] citizen = new boolean[n + 1];
        int [] trusted = new int[n + 1];


        for (int[] civilian : trust) {
            citizen[civilian[0]] = true;
            trusted[civilian[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (trusted[i] == n && !citizen[i]);
        }
        return 0;
    }
}
