package org.leetcode.hashing;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber {

//    Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.


    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i <nums.length; i++) {

            if (i != nums[i]) return i;
        }
        return nums.length;
    }
    public int missingNumberHash(int[] nums) {

        HashSet<Integer> collection = new HashSet<>();

        int i  = 0;
       while (i < nums.length){
           collection.add(nums[i++]);
       }

        for (i = 0; i <nums.length; i++) {

            if (!collection.contains(i)) return i;
        }
        return nums.length;
    }

    public int missingNumberGass(int[] nums) {

        int expected = 0, real = 0;

        for (int i = 0; i < nums.length; i++) {
            expected += i;
            real += nums[i];
        }

        return (expected+ nums.length) - real;
    }
}
