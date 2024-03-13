package org.leetcode.arraysAndStrings;

public class IncreasingTripletSubsequence {

  public static boolean increasingTriplet(int[] nums) {

    int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

    for (int i = 0; i < nums.length; i++) {

      if (nums[i] < first){
        first = nums[i];
        second = Integer.MAX_VALUE;
      }
      else if (nums[i] < second) second = nums[i];
      else if (nums[i] > first && nums[i] > second)  return true;
    }
    return false;
  }

  public static void main(String[] args) {

    int[] arr = new int[]{20,100,10,12,5,13};
    System.out.println(increasingTriplet(arr));
  }

}
