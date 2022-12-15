package org.leetcode.heap;

import org.junit.Test;

public class KthLargestTest {

    @Test
    public void KthLargest() {

        int k = 3;
        int[] ints = {4, 5, 8, 2};
        KthLargest kthLargest = new KthLargest(k, ints);

        int add = kthLargest.add(3);
//        kthLargest.add(5);

        System.out.println(add);


    }

}
