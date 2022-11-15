package org.leetcode.arraysAndStringsTest;

import org.junit.Assert;
import org.junit.Test;
import org.leetcode.arraysAndStrings.RunningSum;

public class RunningSumTest {

    @Test
    public void runningSumTest(){
        RunningSum runningSum = new RunningSum();
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 3, 6, 10};

        int[] output = runningSum.runningSum(input);
        Assert.assertArrayEquals(expected, output);

    }
}
