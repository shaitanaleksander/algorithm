package org.leetcode.trees;

public class BinarySearchTreeToGreatedrSumTree {


    private int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        dfs(root);
        return root;
    }

    private void dfs(TreeNode node) {
        if (node == null) return;
        dfs(node.right);
        node.val += sum;
        sum = node.val;
        dfs(node.left);
    }
}
