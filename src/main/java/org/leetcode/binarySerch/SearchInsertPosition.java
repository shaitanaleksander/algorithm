package org.leetcode.binarySerch;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;


        while (left < right) {

            int middle = (right + left) / 2;
            System.out.println(middle);
            if (nums[middle] < target) {
                left = middle+1;
            }
            else  {
                right = middle-1;
            }
        }
        return nums[left] < target ? left + 1 : left;

    }

}
