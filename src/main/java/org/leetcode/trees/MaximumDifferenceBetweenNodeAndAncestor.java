package org.leetcode.trees;

public class MaximumDifferenceBetweenNodeAndAncestor {

    private int result = 0;

    public int maxAncestorDiff(TreeNode root) {
        dipper(root.left, root.val);
        dipper(root.right, root.val);
        return  result;
    }

    private void dipper(TreeNode treeNode, int ... preValues){

        int[] next = new int[preValues.length + 1];
        int i = 0;

        if (treeNode == null ) return;

        for (int preValue : preValues) {

            result = Math.max(result, Math.abs(preValue - treeNode.val));

            if (treeNode.left != null){
                result = Math.max(result, Math.abs(preValue - treeNode.left.val));
                result = Math.max(result, Math.abs(treeNode.val - treeNode.left.val));
            }

            if (treeNode.right != null){
                result = Math.max(result, Math.abs(preValue - treeNode.right.val));
                result = Math.max(result, Math.abs(treeNode.val - treeNode.right.val));
            }
            next[i++] = preValue;
        }
        next[i] = treeNode.val;
        dipper(treeNode.left, next);
        dipper(treeNode.right, next);
    }

}
