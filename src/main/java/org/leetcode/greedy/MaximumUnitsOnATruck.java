package org.leetcode.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MaximumUnitsOnATruck {

    public int maximumUnits(int[][] boxTypes, int truckSize) {

        ArrayList<int[]> boxes = new ArrayList<>(Arrays.asList(boxTypes));
        boxes.sort((a,b) -> b[1] - a[1]);
        int amount = 0;

        for (int[] box : boxes) {
            if (truckSize <= 0) break;

            var b = truckSize - box[0];
            if (b >= 0){
                truckSize = b;
                amount += box[0] * box[1];
            }
            else{
                b = box[0] + b;
                amount += b * box[1];
                return amount;
            }


        }
        return amount;
    }
}
