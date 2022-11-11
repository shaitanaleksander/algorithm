package org.leetcode.arraysAndStringsTest;

import org.junit.Assert;
import org.junit.Test;
import org.leetcode.arraysAndStrings.SquaresOfSortedArray;

public class SquaresOfSortedArrayTest {

    private SquaresOfSortedArray squares = new SquaresOfSortedArray();
    private  int[] input = {-4, -1, 0, 3, 10};
    private int[] expected = {0, 1, 9, 16, 100};

    @Test
    public void sortedSquaresBasicTest(){
        int[] output = squares.sortedSquaresBasic(input);

        Assert.assertArrayEquals(expected,output);

    }

    @Test
    public void sortedSquaresTest(){
        int[] output = squares.sortedSquares(input);
        Assert.assertArrayEquals(expected,output);
    }
}
