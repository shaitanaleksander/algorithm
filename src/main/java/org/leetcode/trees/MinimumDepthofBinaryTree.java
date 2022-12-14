package org.leetcode.trees;

public class MinimumDepthofBinaryTree {
//
//    Given a binary tree, find its minimum depth.
//    The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
//    Note: A leaf is a node with no children.

    public int minDepth(TreeNode root) {

        if (root == null) return 0;

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (left == 0 && right == 0) return 1;
        else if (left == 0) return right;
        else if (right == 0) return left;
        else return Math.min(left, right) + 1;


    }
}
