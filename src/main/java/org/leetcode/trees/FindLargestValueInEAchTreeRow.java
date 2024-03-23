package org.leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueInEAchTreeRow {

    private List<Integer> result = new ArrayList<>();

    public List<Integer> largestValues(TreeNode root) {

        dfs(root,0);
        return result;
    }

    private void dfs(TreeNode node, int level) {
        if (node == null) return;

        if (result.size() <= level) {
            result.add(node.val);
        } else result.set(level, Math.max(result.get(level), node.val));

        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }

}
