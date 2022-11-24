package org.leetcode.hahingTest;

import org.junit.Assert;
import org.junit.Test;
import org.leetcode.hashing.MaximumNumberOfBalloons;

public class MaximumNumberOfBalloonsTest {

    @Test
    public void maxNumberOfBalloonsTest(){
        MaximumNumberOfBalloons maximumNumberOfBalloons = new MaximumNumberOfBalloons();

        String input = "leetcode";
        int expected = 0;
        int output = maximumNumberOfBalloons.maxNumberOfBalloons(input);

        Assert.assertEquals(expected,output);
    }
}
