package org.leetcode.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class EqualrowAndColumnPairs {


  public int equalPairs(int[][] grid) {
    HashMap<List<Integer>, Integer> vault = new HashMap<>();
    int counter = 0;

    for (int[] ints : grid) {
      ArrayList<Integer> result = new ArrayList<>();
      for (int j = 0; j < ints.length; j++) {
        result.add(ints[j]);
      }
      vault.put(result, vault.getOrDefault(result, 0) + 1);
    }

    for (int i = 0; i < grid.length; i++) {
      ArrayList<Integer> result = new ArrayList<>();
      for (int j = 0; j < grid.length ; j++) {
        result.add(grid[j][i]);
      }
      if (vault.containsKey(result)) counter += vault.get(result);
    }


    return counter;
  }


}
