package org.leetcode.arraysAndStringsTest;

public class Subarray {


//    You are given an integer array nums consisting of n elements, and an integer k.
//    Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
//    Any answer with a calculation error less than 10-5 will be accepted.


    public double findMaxAverage(int[] nums, int k) {

        double subArrSum = 0;
        int left = 0, right = k;

        while (left < k) {
            subArrSum += nums[left++];
        }

        double result = subArrSum / k;
        System.out.println(result);

        left = 0;

        while (right < nums.length) {

            subArrSum -= nums[left++];
            subArrSum += nums[right++];
            if (subArrSum/k > result) result = subArrSum / k;
        }

        return result;
    }
}
