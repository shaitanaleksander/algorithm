package org.leetcode.backtracking;

import org.junit.Test;

import java.util.Arrays;

public class NumbersWithSameConsecutiveDifferencesTest {

    @Test
    public void numsSameConsecDiffTest() {
        var test = new NumbersWithSameConsecutiveDifferences();
        int[] ints = test.numsSameConsecDiff(3, 7);
        System.out.println(Arrays.toString(ints));

    }
}
