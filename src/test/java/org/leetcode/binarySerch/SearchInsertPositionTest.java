package org.leetcode.binarySerch;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPositionTest {

    @Test
    public void searchInsert() {

        SearchInsertPosition test = new SearchInsertPosition();

        int[] nums = {1, 2, 4, 6, 7, 8, 12, 33, 35, 77};
        int target = 9;
        int expected  = 6;
        int result = test.searchInsert(nums, target);
        Assert.assertEquals(expected, result);



    }
}
