package org.leetcode.arraysAndStrings;

public class LongestSubarrayOf1sAfterDeletingOneElement {

  public static int longestSubarray(int[] nums) {

    int result = 0, counter = 0;
    boolean skipped = false;

    int left = 0;
    int right = 0;

    while (right < nums.length) {

      if (nums[right] != 1) {

        if (skipped){
          result = Math.max(result, counter);
          while (nums[left] == 1) {
            counter--;
            left++;
          }
          left++;
        }
        else skipped = true;
      }
      else counter++;

      right++;
    }
    result = Math.max(result, counter);

    return  result == nums.length? result-1: result;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{0,1,1,1,0,1,1,0,1};

    System.out.println(longestSubarray(arr));
  }
}
