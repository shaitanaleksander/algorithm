package org.leetcode.graphs;

import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class KeysAndRooms {

  public boolean canVisitAllRooms(List<List<Integer>> rooms) {

    HashSet<Integer> seen = new HashSet<>();
    Stack<Integer> stack = new Stack<>();
    seen.add(0);
    stack.push(0);

    while (!stack.isEmpty()) {
      int rnumber = stack.pop();

      List<Integer> room = rooms.get(rnumber);

      for (Integer i : room) {
        if (!seen.contains(i)){
          seen.add(i);
          stack.push(i);
        }
      }
    }
    return rooms.size() == seen.size();
  }

}
