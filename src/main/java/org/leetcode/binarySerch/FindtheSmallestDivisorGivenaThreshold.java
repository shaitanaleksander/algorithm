package org.leetcode.binarySerch;

public class FindtheSmallestDivisorGivenaThreshold {

    public int smallestDivisor(int[] nums, int threshold) {

        int left = 0;
        int right = Integer.MAX_VALUE;
        int middle = 0;

        while (left < right) {
            middle = (left + right) / 2;
//            System.out.println(left +"  "+ right);
            int result = calculate(nums, middle);

            if (result <= threshold) {
                right = middle;
            } else left = ++middle;
        }

        return middle;
    }

    public int calculate(int[] arr, float number) {
        int result = 0;

        for (int num : arr) {
            result += Math.ceil(num / number);
        }
        return result;
    }
}
