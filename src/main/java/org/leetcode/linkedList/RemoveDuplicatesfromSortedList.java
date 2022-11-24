package org.leetcode.linkedList;

public class RemoveDuplicatesfromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) return head;

        ListNode slow  = head;
        ListNode fast  = head.next;

        while (fast != null) {

            if (fast.val != slow.val) {
                slow.next = fast;
                slow = slow.next;
            }
            else {
                slow.next = null;
            }
            fast = fast.next;
        }
        return head;
    }
}
