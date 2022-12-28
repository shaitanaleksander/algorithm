package org.leetcode.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ReduceArraySizeToTheHalf {

    public int minSetSize(int[] arr) {

        HashMap<Integer, Integer> counted = new HashMap<>();

        for (int num : arr) {
            counted.
                    put(num, counted.getOrDefault(num, 0) + 1);
        }
        List<Integer> integers = new ArrayList<>(counted.keySet());

        integers.sort((a,b) -> counted.get(b) - counted.get(a));

        int size = arr.length / 2;
        int result = 0;

        for (Integer integer : integers) {
            if (size < 0) {
                return result;
            }
            size -= counted.get(integer);
            result++;
        }
        return result;
    }

}