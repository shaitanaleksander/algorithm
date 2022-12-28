package org.leetcode.binarySerch;

import org.junit.Assert;
import org.junit.Test;

public class FindtheSmallestDivisorGivenaThresholdTest {

    @Test
    public void smallestDivisorTest() {
        var test = new FindtheSmallestDivisorGivenaThreshold();

        int[] arr = {44,22,33,11,1};
        int threshold = 5;
        int expected = 44;


        int real = test.smallestDivisor(arr, threshold);
        Assert.assertEquals(expected,real);

    }
}
