package org.leetcode.stack;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class DecodeString {

  public static String decodeString(String s) {

    LinkedList<String> stack = new LinkedList<>();

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ']') {
        StringBuilder temp = new StringBuilder();
        while (!stack.peek().equals("[")) {
          temp.insert(0, stack.pop());
        }
        stack.remove();

        StringBuilder num = new StringBuilder();

        while (!stack.isEmpty() && stack.peek().matches("\\d+")) {
          num.insert(0, stack.pop());
        }

        Integer repeat = Integer.parseInt(num.toString());
        String repeat1 = temp.toString().repeat(repeat);

        stack.push(repeat1);
      } else stack.push(s.charAt(i) + "");

    }
    return String.join("", stack.reversed());
  }

  public static void main(String[] args) {
    System.out.println(decodeString("3[a]2[bc]")); // abccd--cd--cd--abccd--cd--cdef
  }
}
