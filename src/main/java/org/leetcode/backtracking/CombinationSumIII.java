package org.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CombinationSumIII {

    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        backtracking(ans, new ArrayList<Integer>(),1, 0, k, n);
        return ans;

    }

    private void backtracking(List<List<Integer>> ans, List<Integer> temp,int start, int tempSum, int size, int sum) {

        if (temp.size() > size) return;

        if (tempSum == sum && temp.size() == size ) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < 10; i++) {

            if (i + tempSum <= sum) {
                temp.add(i);
                backtracking(ans, temp,i+1, tempSum+i, size, sum);
                temp.remove(temp.size() - 1);
            }
        }

    }


}
