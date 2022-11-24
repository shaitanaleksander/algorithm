package org.leetcode.hahingTest;

import org.junit.Assert;
import org.junit.Test;
import org.leetcode.hashing.CountingElements;

public class CountingElementsTest {

    @Test
    public void countElementsTest(){
        CountingElements countingElements = new CountingElements();

        int[] input = {1, 3, 2, 3, 5, 0};
        int expected = 3;

        int output = countingElements.countElements(input);
        Assert.assertEquals(expected,output);

    }
}
