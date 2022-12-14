package org.leetcode.trees;

public class ClosestBinarySearchTreeValue {


    public int closestValue(TreeNode root, double target) {

        double abs = Math.abs(root.val - target);

        if (root.val > target && root.left != null){
            int next = closestValue(root.left, target);
            return abs > Math.abs(next - target)? next : root.val;

        }
        else if (root.val < target && root.right != null){
            int next = closestValue(root.right, target);
            return abs > Math.abs(next - target)? next : root.val;
        }

        else return root.val;

    }


}
