package org.leetcode.arraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigzagConversion {
    public static String convert(String s, int numRows) {

        StringBuilder[] collector = new StringBuilder[numRows];
        int pointer = 0;
        for (int i = 0; i < numRows; i++) {
            collector[i] = new StringBuilder();
        }

        while (pointer < s.length()) {

            int p = 0;
            while (p < numRows && pointer < s.length()) {

                collector[p].append(s.charAt(pointer));
                pointer++;
                p++;
            }
            p =  p-2;
            while (p > 0 && pointer < s.length()) {

                collector[p].append(s.charAt(pointer));
                pointer++;
                p--;
            }
        }

        return build(collector);
    }

    private static String build(StringBuilder[] arr) {
        StringBuilder result = new StringBuilder();
        for (StringBuilder stringBuilder : arr) {
            if (stringBuilder == null) break;
            result.append(stringBuilder);
        }
        return result.toString();
    }
}
