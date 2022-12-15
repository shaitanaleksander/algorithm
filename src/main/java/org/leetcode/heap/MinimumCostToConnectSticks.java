package org.leetcode.heap;

import java.util.PriorityQueue;

public class MinimumCostToConnectSticks {

    public int connectSticks(int[] sticks) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i : sticks) queue.add(i);
        int result = 0;

        while (queue.size() > 1) {
            int stick = queue.remove() + queue.remove();
            result += stick;
            queue.add(stick);
        }
        return result;
    }

}
