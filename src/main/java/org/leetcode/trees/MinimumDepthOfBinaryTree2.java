package org.leetcode.trees;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree2 {

    public int minDepth(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int depth = 0;

        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();


            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();

                if (node.left == null && node.right == null) return depth;

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);

            }
        }
        return depth;
    }
}
