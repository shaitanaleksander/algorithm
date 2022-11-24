package org.leetcode.linkedList;

public class MiddleOfTheLinkedList {
//
//    Given the head of a singly linked list, return the middle node of the linked list.
//
//    If there are two middle nodes, return the second middle node.


    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;


        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return  fast == null ? slow : slow.next;
    }
}
