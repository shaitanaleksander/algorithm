package org.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

public class ReduceArraySizeToTheHalfTest {

    @Test
    public void minSetSizeTest() {
        ReduceArraySizeToTheHalf reduceArraySizeToTheHalf = new ReduceArraySizeToTheHalf();

        int[] arr = {3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        int expected = 2;
        int actual = reduceArraySizeToTheHalf.minSetSize(arr);
        Assert.assertEquals(expected, actual);


    }

}
