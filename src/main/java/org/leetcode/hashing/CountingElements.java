package org.leetcode.hashing;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {

    public int countElements(int[] arr) {

        HashSet<Integer> collector = new HashSet<>();
        int i = 0;
        int result = 0;

        while (i < arr.length){
            collector.add(arr[i++]);
        }
        System.out.println(collector);
        i = 0;

        while (i < arr.length) {
            if (collector.contains(arr[i++]+1)){
                result++;
            }
        }
        return result;
    }

}
