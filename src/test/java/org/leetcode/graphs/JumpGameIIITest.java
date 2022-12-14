package org.leetcode.graphs;

import org.junit.Assert;
import org.junit.Test;

public class JumpGameIIITest {


    @Test
    public void canReachTest() {
        JumpGameIII jumpGameIII = new JumpGameIII();

        int[] arr = new int[]{4,2,3,0,3,1,2};
        int start = 5;
        boolean expected = true;
        boolean result = jumpGameIII.canReach(arr, start);

        Assert.assertEquals(expected, result);

    }
}
