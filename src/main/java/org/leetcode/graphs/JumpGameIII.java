package org.leetcode.graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class JumpGameIII {

    public boolean canReach(int[] arr, int start) {

        HashSet<Integer> seen = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int j = 0; j < size; j++) {

                Integer i = queue.remove();
                if (arr[i] == 0) return true;

                for (Integer index : new int[]{i - arr[i], i + arr[i]}) {
                    if (index >= 0 && index < arr.length && !seen.contains(index)) {
                        seen.add(index);
                        queue.add(index);
                    }
                }
            }
        }
        return false;
    }

}
