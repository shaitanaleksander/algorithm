package org.leetcode.arraysAndStrings;

public class NumerOfLaserBeamsInABank  {


    public int numberOfBeams(String[] bank) {

        int result = 0;
        int mid = 0;

        for (String ceiling : bank) {

            int counter = 0;

            for (int i = 0; i < ceiling.length(); i++) {
                 if (ceiling.charAt(i) == '1') counter++;
            }

            if (counter == 0) continue;
            result += mid * counter;
            mid = counter;
        }
        return result;
    }

}
