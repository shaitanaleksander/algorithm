package org.leetcode.statckTest;

import java.util.Stack;

public class MakeTheStringGreat {

    public String makeGood(String s) {

        Stack<Character> stack = new Stack<>();

        for (Character ch: s.toCharArray()) {
            if (!stack.isEmpty() && Character.toLowerCase(stack.peek()) == Character.toLowerCase(ch)){
                if (stack.peek() != ch) stack.pop();
            }
            else stack.push(ch);
        }


        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()){
            builder.append(stack.pop());
        }

        return builder.reverse().toString();
    }

}
