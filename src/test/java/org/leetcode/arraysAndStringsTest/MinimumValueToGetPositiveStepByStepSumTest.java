package org.leetcode.arraysAndStringsTest;

import org.junit.Assert;
import org.junit.Test;
import org.leetcode.arraysAndStrings.MinimumValueToGetPositiveStepByStepSum;

public class MinimumValueToGetPositiveStepByStepSumTest {


    @Test
    public void minStartValueTest(){
        MinimumValueToGetPositiveStepByStepSum min = new MinimumValueToGetPositiveStepByStepSum();

        int[] input = {-3, 2, -3, 4, 2};
        int expected = 5;

        int output = min.minStartValueBruteForce(input);
        Assert.assertEquals(expected, output);

    }

    @Test
    public void minStartValueBinarySearchTest(){
        MinimumValueToGetPositiveStepByStepSum min = new MinimumValueToGetPositiveStepByStepSum();

        int[] input = {-3, 2, -3, 4, 2};
        int expected = 5;

        int output = min.minStartValueBinarySearch(input);
        Assert.assertEquals(expected, output);

    }

    @Test
    public void minStartValueBinarySearchCase2Test(){
        MinimumValueToGetPositiveStepByStepSum min = new MinimumValueToGetPositiveStepByStepSum();

        int[] input = {1,2};
        int expected = 1;

        int output = min.minStartValueBinarySearch(input);
        Assert.assertEquals(expected, output);

    }
}
