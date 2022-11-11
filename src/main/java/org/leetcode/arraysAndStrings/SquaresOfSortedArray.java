package org.leetcode.arraysAndStrings;

import java.util.Arrays;

public class SquaresOfSortedArray {


//    Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.


    public int[] sortedSquaresBasic(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = Math.abs(nums[i] * nums[i]);
        }

        Arrays.sort(result);
        return result;
    }

    // two pointers approach

    public int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];
        int left = 0, right  = nums.length - 1, i = right ;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare){
                result[i] = leftSquare;
                left++;
            }else {
                result[i] = rightSquare;
                right--;
            }
                i--;
        }
        return result;
    }
}
