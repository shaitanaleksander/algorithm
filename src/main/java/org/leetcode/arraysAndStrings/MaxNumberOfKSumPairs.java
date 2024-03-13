package org.leetcode.arraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MaxNumberOfKSumPairs {

  public int maxOperations(int[] nums, int k) {

    Arrays.sort(nums);
    int result = 0;

    int left = 0, right = nums.length - 1;

    while (nums[right] > k && right > left) right--;

    while (right > left) {

      if ((nums[right] + nums[left]) == k) {
        result++;
        right--;
        left++;
      }
      else if ((nums[right] + nums[left]) > k)  right--;
      else left++;
    }

    return result;
  }


}
