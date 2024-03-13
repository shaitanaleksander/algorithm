package org.leetcode.hashing;

import java.util.*;

public class FindTheDifferenceOfTwoArrays {

  public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

    HashSet<Integer> vault = new HashSet<>();

    for (int i : nums1) vault.add(i);
    List<Integer> first = new ArrayList<>();
    for (int i : nums2) {
      if (!vault.contains(i)){
        first.add(i);
        vault.add(i);
      }

    }

    vault = new HashSet<>();
    for (int i : nums2) vault.add(i);

    List<Integer> second = new ArrayList<>();

    for (int i : nums1){
      if (!vault.contains(i)){
        second.add(i);
        vault.add(i);
      }
    }

    return List.of(second, first);

  }


}
