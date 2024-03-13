package org.leetcode.arraysAndStrings;

public class MergeStringsAlternately {

  public String mergeAlternately(String word1, String word2) {

    char[] result = new char[word1.length() + word2.length()];
    int maxLength = Math.max(word1.length(), word2.length());

    int index = 0;
    int pointer = 0;

    while (pointer < maxLength) {

      if (word1.length() > pointer) result[index++] = word1.charAt(pointer);
      if (word2.length() > pointer) result[index++] = word2.charAt(pointer);
      pointer++;
    }
    return new String(result);
  }


}
