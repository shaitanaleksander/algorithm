package org.leetcode.linkedList;

import java.util.ArrayList;
import java.util.List;

public class MaximumTwinSumOfALinkedList {

  public int pairSum(ListNode head) {

    ListNode fast = head.next;
    ListNode slow = head;
    ArrayList<Integer> collector = new ArrayList<>();

    while (fast != null && fast.next.next != null) {
      collector.add(slow.val);
      fast = fast.next.next;
      slow = slow.next;
    }
    int max = 0;

    System.out.println(collector);
    for (int i = collector.size() - 1; i >= 0; i--) {

      max = Math.max(max, collector.get(i) + slow.val);
      slow = slow.next;

    }

    return max;
  }

}
