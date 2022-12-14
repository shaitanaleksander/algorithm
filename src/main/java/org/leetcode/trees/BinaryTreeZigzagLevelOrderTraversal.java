package org.leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;

        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);

        boolean flip = true;
        while (!nodes.isEmpty()) {

            int size = nodes.size();

            LinkedList<Integer> collector = new LinkedList<>();
            LinkedList<TreeNode> newNodes = new LinkedList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = nodes.remove();
                if (flip) collector.add(node.val);
                else collector.push(node.val);

                if (node.left != null) nodes.add(node.left);
                if (node.right != null) nodes.add(node.right);
            }

            result.add(collector);
            flip = !flip;
        }
        return result;
    }

}
