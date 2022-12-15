package org.leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RemoveStonesToMinimizeTheTotal {

    public int minStoneSum(int[] piles, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : piles) queue.offer(i);

        while (k-- > 0) {
            double pile = queue.remove();
            double floor = Math.round( pile / 2);
            System.out.println(pile/2);
            queue.add((int)floor);
        }

        int accumulator = 0;
        for (int i :queue) accumulator +=i;
        return accumulator;
    }

}
