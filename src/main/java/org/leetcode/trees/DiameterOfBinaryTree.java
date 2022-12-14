package org.leetcode.trees;

public class DiameterOfBinaryTree {

    private int result = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dipper(root);
        return result;
    }

    private int dipper(TreeNode node) {
        if (node == null) return 0;

        int left = dipper(node.left);
        int right = dipper(node.right);

        result = Math.max(result, left + right + 1);
        return Math.max(left, right) + 1;

    }
}
