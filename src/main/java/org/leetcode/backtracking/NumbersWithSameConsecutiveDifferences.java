package org.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbersWithSameConsecutiveDifferences {

    /*
    Given two integers n and k, return an array of all the integers of length n where the difference between every two consecutive digits is k.
     You may return the answer in any order. Note that the integers should not have leading zeros. Integers as 02 and 043 are not allowed.
     */

    public int[] numsSameConsecDiff(int n, int k) {
        ArrayList<String> ans = new ArrayList<>();

        IntStream.range(1, 10).forEach( number -> backtracking(ans, new ArrayList<>(), number, n, k));

        return ans.stream().mapToInt(Integer::parseInt).toArray();

    }


    private void backtracking(List<String> ans, List<Integer> temp, int prev, int size, int difference) {
        temp.add(prev);
        if (temp.size() == size) {
            System.out.println(temp);
            ans.add(temp.stream().map(Object::toString).collect(Collectors.joining()));
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (Math.abs(i - prev) == difference) {
                backtracking(ans, temp, i,size,difference);
                temp.remove(temp.size() - 1);
            }
            if (prev < i && Math.abs(i - prev) > difference ) break;

        }
    }
}
