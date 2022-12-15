package org.leetcode.heap;

import org.junit.Assert;
import org.junit.Test;

public class KClosestPointsToOriginTest {

    @Test
    public void kClosest() {
        var test = new KClosestPointsToOrigin();
        int[][] arr = {{3,3},{5,-1},{-2,4}};
        int[][] expected = {{3,3},{-2,4}};
        int k = 2;
        int[][] real = test.kClosest(arr, k);
        Assert.assertArrayEquals(expected, real);

    }
}
