package org.leetcode.linkedList;

public class ReverseLinkedListII {



    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode curr = head;
        ListNode before = new ListNode();
        before.next = head;
        head = before;

        int counter  = 1;

        while (curr != null) {
            if (counter >= left && counter <= right) {
                ListNode afterNext = curr.next.next;
                curr.next.next = before.next;
                before.next = curr.next;
                before.next.next = curr;
                curr.next = afterNext;
            }
            else {
                before = curr;
                curr = curr.next;
            }

            counter++;
        }
      return head.next;
    }
}
