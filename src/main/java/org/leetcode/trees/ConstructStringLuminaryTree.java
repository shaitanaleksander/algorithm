package org.leetcode.trees;

public class ConstructStringLuminaryTree {

    private StringBuilder builder = new StringBuilder();

    public String tree2str(TreeNode root) {
        dfs(root);
        return builder.toString();
    }

    private void dfs(TreeNode node) {
        if (node == null) return;
        builder.append(node.val);
        if (node.left != null) {
            builder.append("(");
            dfs(node.left);
            builder.append(")");
        }

        if (node.right != null) {
            if (node.left == null){
                builder.append("()");
            }
            builder.append("(");
            dfs(node.right);
            builder.append(")");
        }
    }
}
