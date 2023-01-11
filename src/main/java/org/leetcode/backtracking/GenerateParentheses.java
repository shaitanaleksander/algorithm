package org.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        backtracking(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    private void backtracking(List<String> ans, StringBuilder builder, int open, int close, int max) {

        if (builder.length() == max * 2) {
            ans.add(builder.toString());
            return;
        }

        if (open < max) {
            builder.append("(");
            backtracking(ans, builder, open + 1, close, max);
            builder.deleteCharAt(builder.length() - 1);
        }
        if (close < open){

            builder.append(")");
            backtracking(ans, builder, open, close + 1, max);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}
