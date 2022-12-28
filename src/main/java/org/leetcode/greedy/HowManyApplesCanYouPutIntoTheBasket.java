package org.leetcode.greedy;

import java.util.Arrays;

public class HowManyApplesCanYouPutIntoTheBasket {


    public int maxNumberOfApples(int[] weight) {

        int maxWeight = 5000;
        Arrays.sort(weight);
        int amount = 0;

        for (int apple : weight) {

            int diff = maxWeight - apple;
            if (diff >= 0) {
                maxWeight = diff;
                amount++;
            } else return amount;
        }

        return amount;
    }

}
