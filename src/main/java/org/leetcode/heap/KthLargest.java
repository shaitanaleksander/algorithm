package org.leetcode.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {

    private final int k;
    private  PriorityQueue<Integer> queue;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.queue = new PriorityQueue<>();
        for (int i: nums) this.queue.add(i);
        while (queue.size() > k) queue.poll();
    }

    public int add(int val) {
        queue.add(val);
        if (queue.size() > k) queue.poll();
        return queue.peek();
    }
}
