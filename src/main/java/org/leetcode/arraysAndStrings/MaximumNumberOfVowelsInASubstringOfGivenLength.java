package org.leetcode.arraysAndStrings;

import java.util.Set;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
  public static int maxVowels(String s, int k) {

    Set<Character> vault = Set.of('a', 'e', 'o', 'i', 'u');

    int result = 0;
    int left = 0, right = 0;

    while (right < k) if (vault.contains(s.charAt(right++))) result++;

    int max = result;


    while (right < s.length()) {


      if (vault.contains(s.charAt(right))) result++;

      if (vault.contains(s.charAt(left))) result--;

      max = Math.max(max, result);

      left++;
      right++;
    }


    return max;
  }

  public static void main(String[] args) {

    System.out.println(maxVowels("abciiidef", 3));

  }
}
