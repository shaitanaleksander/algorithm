package org.leetcode.hashing;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {

  public boolean uniqueOccurrences(int[] arr) {

    HashMap<Integer, Integer> counter = new HashMap<>();

    for (int number : arr) {
      counter.put(number, counter.getOrDefault(number, 0) + 1);
    }

    HashSet<Object> filter = new HashSet<>();

    for (Integer value : counter.values()) {
      if (filter.contains(value)) return false;
      else filter.add(value);
    }

    return true;
  }

}
