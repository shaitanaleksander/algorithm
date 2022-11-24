package org.leetcode.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestUniqueNumber {


    public int largestUniqueNumber(int[] nums) {
        HashMap<Integer, Integer> collector = new HashMap<>();

        for (int num : nums) {
            collector.computeIfPresent(num, ((integer, integer2) -> integer2+1));
            collector.putIfAbsent(num, 1);
        }

        int biggest = -1;
        for (Map.Entry<Integer, Integer> entry : collector.entrySet()) {
            if (entry.getValue() == 1) biggest = Math.max(biggest, entry.getKey());
        }

        return biggest;
    }

    public int largestUniqueNumberSort(int[] nums) {
        Arrays.sort(nums);
        int result  = nums[nums.length-1];
        int appearance = 1;

        for (int i = nums.length - 2; i >= 0 ; i--) {

            if (nums[i] == result) appearance++;
            else {
                if (appearance == 1)return result;
                result = nums[i];
                appearance = 1;
            }

        }
        return appearance == 1? result: -1;
    }



}
