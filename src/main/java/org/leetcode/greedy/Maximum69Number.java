package org.leetcode.greedy;

public class Maximum69Number {

    public static void main(String[] args){
            System.out.println(maximum69Number(9669));
    }


    public static int maximum69Number (int num) {

        StringBuilder string = new StringBuilder(Integer.toString(num));
        System.out.println(string);

        for(int i = 0; i < string.length(); i++) {

            if (string.charAt(i) != '9') {

                string.setCharAt(i, '9');
                break;
            }
        }
        return Integer.parseInt(string.toString());
    }

}
