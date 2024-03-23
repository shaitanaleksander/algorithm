package org.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class ConvertBinarySeaerchTreToSortedDoubleLinkedList {

    private Node first;

    public Node treeToDoublyList(Node root) {
        if (root == null) return root;
        Node last = dfs(root);
        first.left = last;
        last.right = first;
        return first;
    }

    private Node dfs(Node node) {
        if (node == null) return null;
        if (node.left == null && node.right == null && first == null) first = node;

        node.left = dfs(node.left);
        if (node.left != null) node.left.right = node;
        node.right = dfs(node.right);
        if (node.right != null) node.right.left = node;
        return node.right == null ? node : node.right;
    }
}


class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}
