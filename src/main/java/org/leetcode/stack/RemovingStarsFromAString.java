package org.leetcode.stack;

import java.util.LinkedList;

public class RemovingStarsFromAString {

  public String removeStars(String s) {

    LinkedList<Character> stack = new LinkedList<>();

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '*') stack.pop();
      else stack.push(s.charAt(i));
    }
    StringBuilder result = new StringBuilder();

    for (Character c : stack) result.append(c);

    return result.reverse().toString();
  }

}
