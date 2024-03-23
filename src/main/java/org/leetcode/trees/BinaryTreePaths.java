package org.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    private List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        bfs(root, "");
        return result;
    }

    private void bfs(TreeNode node, String path) {
        if (node == null) return;
        path = path + node.val;
        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }
        bfs(node.left, path+"->");
        bfs(node.right, path+"->");

    }
}
