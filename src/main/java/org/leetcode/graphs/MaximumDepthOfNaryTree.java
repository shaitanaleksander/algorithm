package org.leetcode.graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumDepthOfNaryTree {

    private int result = 0;

    public int maxDepth(Node root) {
     dfs(root, 1);
        return result;
    }

    private void dfs(Node node, int depth) {
        if (node == null) return;
        result = Math.max(result, depth);
        for (Node n: node.children){
            dfs(n, depth + 1);
        }
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