package org.leetcode.arraysAndStringsTest;

import org.junit.Assert;
import org.junit.Test;

public class MaxConsecutiveTest {


    @Test
    public void longestOnesTest() {

        MaxConsecutive maxConsecutive = new MaxConsecutive();
        int[] input = {0,0,1,1,1,0,0};
        int k = 0, expected = 3;

        int result = maxConsecutive.longestOnes(input, k);
        Assert.assertEquals(expected, result);

    }
}
