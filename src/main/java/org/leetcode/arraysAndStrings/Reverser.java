package org.leetcode.arraysAndStrings;

import java.util.stream.Stream;

public class Reverser {


//    Write a function that reverses a string. The input string is given as an array of characters s.
//
//    You must do this by modifying the input array in-place with O(1) extra memory.

    public void reverseString(char[] s) {

        int start = 0, end = s.length-1;

        while (start < end) {

            char c = s[start];
            s[start] = s[end];
            s[end] = c;

            start++;
            end--;

        }
    }
}
