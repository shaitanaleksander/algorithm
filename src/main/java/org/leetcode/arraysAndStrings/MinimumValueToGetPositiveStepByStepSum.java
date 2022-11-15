package org.leetcode.arraysAndStrings;

public class MinimumValueToGetPositiveStepByStepSum {

//    Given an array of integers nums, you start with an initial positive value startValue.
//
//    In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).
//
//    Return the minimum positive value of startValue such that the step by step sum is never less than 1.


    public int minStartValueBruteForce(int[] nums) {

        int counter = 0;
        int candidate = 0;
        int accumulator = candidate;

        while (counter < nums.length) {
            int value = nums[counter++] + accumulator;
            if (value < 1){
                counter = 0;
                candidate++;
                accumulator = candidate;
            }
            else accumulator = value;

        }
        return candidate;
    }

    public int minStartValueBinarySearch(int[] nums) {

        int left  = 0, right = nums.length * 100, counter = 0, accumulator = (left + right)/2;

        while(left < right){
            System.out.println(left +"  " + right);

            int value = nums[counter++] + accumulator;

            if (value < 1){
                counter = 0;

                left = (left + right)/2;
                left++;
                accumulator = (left + right)/2;

            }
            else if (counter >= nums.length){
                counter = 0;
                right = (left + right) / 2;
                accumulator = (left + right) / 2;
            }
            else accumulator = value;

        }

        return left == 0? 1: left;
    }
}
