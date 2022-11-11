package org.leetcode.arraysAndStringsTest;

import org.junit.Assert;
import org.junit.Test;

public class SubarrayTest {

    @Test
    public void findMaxAverageTest(){

        Subarray subarray = new Subarray();
        int[] input = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double expected = 12.75000;

        Assert.assertEquals(expected, subarray.findMaxAverage(input, k), 0);

    }
}
