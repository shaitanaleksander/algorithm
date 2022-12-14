package org.leetcode.trees;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {

    public int deepestLeavesSum(TreeNode root) {

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        int result = 0;

        while (!nodes.isEmpty()) {
            int size = nodes.size();
            result = 0;

            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.remove();
                result += node.val;

                if (node.left != null) nodes.add(node.left);
                if (node.right != null) nodes.add(node.right);
            }
        }

        return result;
    }

}
