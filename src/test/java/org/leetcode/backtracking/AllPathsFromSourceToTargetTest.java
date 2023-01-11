package org.leetcode.backtracking;

import org.junit.Test;

import java.util.List;

public class AllPathsFromSourceToTargetTest {

    @Test
    public void allPathsSourceTargetTest() {
        var test = new AllPathsFromSourceToTarget();
        int[][] input = {{4,3,1},{3,2,4},{3},{4},{}};
        List<List<Integer>> lists = test.allPathsSourceTarget(input);
        System.out.println(lists);
    }
}
