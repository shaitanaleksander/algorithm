
package org.leetcode.arraysAndStrings;

import java.util.List;
import java.util.Optional;

public class GreatestCommonDivisorOfStrings {
  public  String gcdOfStrings(String str1, String str2) {

    if (!(str1 + str2).equals(str2 + str1)) return "";
    int gcd = gcd(str1.length(), str2.length());
    return str2.substring(0, gcd);

  }


  private  int gcd(int x, int y) {
    if (y == 0) return x;
    return gcd(y, x % y);
  }

}
