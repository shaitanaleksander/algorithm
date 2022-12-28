package org.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

public class MaximumUnitsOnATruckTest {

    @Test
    public void maximumUnitsTest() {

        MaximumUnitsOnATruck maximumUnitsOnATruck = new MaximumUnitsOnATruck();

        int[][] boxes = {{1, 3}, {2, 2}, {3, 1}};
        int truck = 4;
        int expected = 8;

        int result = maximumUnitsOnATruck.maximumUnits(boxes, truck);

        Assert.assertEquals(expected,result);

    }

}
