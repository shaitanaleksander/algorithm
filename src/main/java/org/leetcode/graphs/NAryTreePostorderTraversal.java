package org.leetcode.graphs;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePostorderTraversal {

    private List<Integer> result = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        dfs(root);
        return result;
    }

    private void dfs(Node node) {
        if (node == null) return;
        if (node.children.isEmpty()) {
            result.add(node.val);
            return;
        }
        for (Node child : node.children) {
            dfs(child);
        }
        result.add(node.val);
    }


    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }

    }
}
