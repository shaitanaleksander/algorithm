package org.leetcode.statckTest;

import org.junit.Assert;
import org.junit.Test;
import org.leetcode.stack.StockSpanner;

public class StockSpannerTest {

    @Test
    public void next() {
        StockSpanner stockSpanner = new StockSpanner();
        Assert.assertEquals(1, stockSpanner.next(100));
        Assert.assertEquals(1, stockSpanner.next(80));
        Assert.assertEquals(1, stockSpanner.next(60));
        Assert.assertEquals(2, stockSpanner.next(70));


    }

}
