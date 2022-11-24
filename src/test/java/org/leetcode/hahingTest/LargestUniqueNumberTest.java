package org.leetcode.hahingTest;

import org.junit.Assert;
import org.junit.Test;
import org.leetcode.hashing.LargestUniqueNumber;

public class LargestUniqueNumberTest {

    @Test
    public void largestUniqueNumberTest(){

        LargestUniqueNumber largestUniqueNumber = new LargestUniqueNumber();
        int[] input = {5, 7, 3, 9, 4, 9, 8, 3, 1};
        int expected = 8;

        int output = largestUniqueNumber.largestUniqueNumber(input);

        Assert.assertEquals(expected, output);
    }

    @Test
    public void largestUniqueNumberSortTest(){

        LargestUniqueNumber largestUniqueNumber = new LargestUniqueNumber();
        int[] input = {5, 7, 3, 9, 4, 9, 8, 3, 1};
        int expected = 8;

        int output = largestUniqueNumber.largestUniqueNumberSort(input);

        Assert.assertEquals(expected, output);
    }
}
