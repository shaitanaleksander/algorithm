package org.leetcode.hahingTest;

import org.junit.Assert;
import org.junit.Test;
import org.leetcode.hashing.MissingNumber;

public class MissingNumberTest {


    @Test
    public void missingNumberTest() {
        MissingNumber missingNumber = new MissingNumber();
        int[] input = {9,6,4,2,3,5,7,0,1};
        int expected = 8;

        int result1 = missingNumber.missingNumber(input);
        int result2 = missingNumber.missingNumberHash(input);
        int result3 = missingNumber.missingNumberGass(input);

        Assert.assertEquals(expected, result1);
        Assert.assertEquals(expected, result2);
        Assert.assertEquals(expected, result3);
    }
}
