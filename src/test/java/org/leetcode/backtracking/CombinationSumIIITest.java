package org.leetcode.backtracking;

import org.junit.Test;

import java.util.List;

public class CombinationSumIIITest {

    @Test
    public void combinationSum3Test() {
        CombinationSumIII combinationSumIII = new CombinationSumIII();
        List<List<Integer>> lists = combinationSumIII.combinationSum3(3, 9);
        System.out.println(lists);

    }
}
