package org.leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StockSpanner {


    private final Stack<Integer> stack = new Stack<>();
    private final Map<Integer, Integer> collector = new HashMap<>();

    public StockSpanner() {

    }

    public int next(int price) {

        int sequence /*hello world */ = 1;
        while (!stack.isEmpty() && stack.peek() <= price) {
            sequence += collector.remove(stack.pop());
        }
        stack.push(price);
        collector.put(price, sequence);
        return sequence;
    }
}
