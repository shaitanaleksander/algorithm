package org.leetcode.arraysAndStrings;

import java.util.Set;

public class ReverseVowelsOfAString {

  public static String reverseVowels(String s) {

    Set<Character> vowels = Set.of('e', 'E', 'a', 'A', 'i', 'I', 'o', 'O', 'u', 'U');

    char[] word = s.toCharArray();

    int left = 0, right = word.length-1;

    while (left < right) {

      if (!vowels.contains(word[left])) left++;
      if (!vowels.contains(word[right])) right--;

      if (vowels.contains(word[right]) && vowels.contains(word[right])) {
        char c = word[left];
        word[left] = word[right];
        word[right] = c;
        left++;
        right--;
      }
    }
    return new String(word);
  }


  public static void main(String[] args) {

    System.out.println(reverseVowels("hello"));

  }
}
