package org.leetcode.binarySerch;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubsequenceWithLimitedSumTest {

    @Test
    public void answerQueriesTest() {

        var longestSubsequenceWithLimitedSum = new LongestSubsequenceWithLimitedSum();
        int[] nums = {4,5,2,1};
        int[] queries = {3,10,21};
        int[] expected = {2, 3, 4};

        int[] actual = longestSubsequenceWithLimitedSum.answerQueries(nums, queries);

        Assert.assertArrayEquals(expected,actual);


    }

}
