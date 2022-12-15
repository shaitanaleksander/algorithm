package org.leetcode.heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {

    public static void main(String[] args) {
        System.out.println(Math.pow(Math.abs(3), 2) + Math.pow(Math.abs(3), 2));
    }

    public int[][] kClosest(int[][] points, int k) {

        int counter = 0;


        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> {
            var firs = Math.pow(Math.abs(a[0]),2) + Math.pow(Math.abs(a[1]), 2);
            var second = Math.pow(Math.abs(b[0]),2) + Math.pow(Math.abs(b[1]), 2);
            return (int) (second - firs);

        });

        for (int[] key : points) {
            queue.offer(key);
            if (queue.size() > k) queue.remove();
        }

        int[][] result = new int[queue.size()][2];

        while (!queue.isEmpty()){
            result[counter++] = queue.remove();
        }

        System.out.println(Arrays.deepToString(result));
        return result;
    }

}
