package org.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AllPathsFromSourceToTarget {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        ArrayList<List<Integer>> ans = new ArrayList<>();
        backtracking(new ArrayList<>(), ans,0, graph);
        return ans;
    }

    private void backtracking(List<Integer> temp, List<List<Integer>> ans, Integer node, int [][] graph) {
        temp.add(node);

        if (node == graph.length - 1){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < graph[node].length ; i++) {
           int val = graph[node][i];
           backtracking(temp, ans ,val, graph);
            temp.remove(temp.size() - 1);

        }
    }
}
