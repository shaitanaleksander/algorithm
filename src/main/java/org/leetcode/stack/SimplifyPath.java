package org.leetcode.stack;

import java.util.Arrays;
import java.util.Set;
import java.util.Stack;

public class SimplifyPath {

    public SimplifyPath() {
    }

    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();
        String[] dirs = path.split("/");


        for (String dir: dirs) {
            if (dir.equals("..")){
                if (!stack.isEmpty())stack.pop();
            }
            else if (dir.equals(".") || dir.isEmpty()) {
            }
            else stack.push(dir);
        }

        StringBuilder builder = new StringBuilder();

        for (String dir : stack) {

            builder.append("/");
            builder.append(dir);
        }

        return builder.length() == 0? "/": builder.toString();
    }
}
