package org.leetcode.trees;

public class SumOfNodesWithEvenValuedGrandparent {

    private int sum = 0;

    public int sumEvenGrandparent(TreeNode root) {

        dfs(root, -1, -1);
        return sum;
    }


    private void dfs(TreeNode node, int parent, int grandparent) {
        if (node == null) return;
        if (grandparent % 2 == 0) {
            sum += node.val;
        }

        dfs(node.left, node.val, parent);
        dfs(node.right, node.val, parent);

    }
}
