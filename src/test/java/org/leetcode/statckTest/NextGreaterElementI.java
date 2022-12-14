package org.leetcode.statckTest;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> vault = new HashMap<>();

        for (int j : nums2) {
            while (!stack.isEmpty() && j > stack.peek()) {
                vault.put(stack.pop(), j);
            }
            stack.push(j);
        }

        while (!stack.isEmpty()) {
            vault.put(stack.pop(), -1);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = vault.get(nums1[i]);
        }

        return nums1;
    }

}
