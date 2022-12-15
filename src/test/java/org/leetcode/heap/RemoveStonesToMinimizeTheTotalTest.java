package org.leetcode.heap;

import org.junit.Assert;
import org.junit.Test;

public class RemoveStonesToMinimizeTheTotalTest {

    @Test
    public void minStoneSumTest(){
        RemoveStonesToMinimizeTheTotal removeStonesToMinimizeTheTotal = new RemoveStonesToMinimizeTheTotal();
        int result = removeStonesToMinimizeTheTotal.minStoneSum(new int[]{4, 3, 6, 7}, 3);
        Assert.assertEquals(12,result);

    }
}
