package org.leetcode.trees;

import java.util.HashSet;
import java.util.Set;

public class PseudoPalindromicPathsinABinaryTree {

    private int result = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        dfs(root, new HashSet<>());
        return result;
    }

    public void dfs(TreeNode node, Set<Integer> set) {
        if (node == null) return;

        if (set.contains(node.val)){
            set.remove(node.val);
        }
        else {
            set.add(node.val);
        }

        if (node.left == null && node.right == null) {
            result += set.size() <= 1? 1: 0;
            return;
        }
        HashSet<Integer> right = new HashSet<>(set);
        dfs(node.left, set);
        dfs(node.right, new HashSet<>(right));
    }

}
