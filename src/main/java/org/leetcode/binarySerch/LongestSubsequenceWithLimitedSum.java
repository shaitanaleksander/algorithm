package org.leetcode.binarySerch;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {

    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        for (int i = 0; i < queries.length; i++) {
            int counter = 0;
            for (int num : nums) {
                int dif = queries[i] - num;
                if (dif >= 0) {
                    queries[i] = dif;
                    counter++;
                }else {
                    break;
                }
            }

            queries[i] = counter;

        }
        return queries;
    }

}
