package org.leetcode.arraysAndStrings;

public class StringCompression {


  public static int compress(char[] chars) {

    if (chars.length == 0) return 0;

    StringBuilder stringBuilder = new StringBuilder();
    char c = chars[0];
    int sequence = 1;
    stringBuilder.append(c);

    for (int i = 1; i < chars.length; i++) {

      if (chars[i] == c){
        sequence++;
      }
      else {
       if (sequence > 1) stringBuilder.append(sequence);
       sequence = 1;
        c = chars[i];
        stringBuilder.append(c);
      }
    }

    if (sequence > 1) stringBuilder.append(sequence);
    for (int i = 0; i < stringBuilder.length(); i++) {
        chars[i] = stringBuilder.charAt(i);
      }
      return stringBuilder.length();
  }


  public static void main(String[] args) {

    char[] arr = new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
    System.out.println(compress(arr));
    System.out.println(arr);
  }
}
