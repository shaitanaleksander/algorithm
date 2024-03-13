package org.leetcode.linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class numberOFRecentCalls {


  private LinkedList<Integer> queue = new LinkedList<>();

  public int ping(int t) {
    while (!queue.isEmpty() && (queue.getLast() - t) <= 0 ) queue.removeLast();
    System.out.println(queue);
    queue.push(t);
    return queue.size();
  }
}

