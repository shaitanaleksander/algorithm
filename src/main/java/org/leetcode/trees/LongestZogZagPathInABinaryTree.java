package org.leetcode.trees;

public class LongestZogZagPathInABinaryTree {

  int max = 0;

  public int longestZigZag(TreeNode root) {
    diver(root.left, false, 0);
    diver(root.right, true, 0);
    return max;
  }

  private void diver(TreeNode node, boolean goRight, int count) {

    if (node == null) return;
    max = Math.max(max, count+1);

    if (goRight){
       diver(node.left, !goRight, count + 1);
       diver(node.right,goRight, 0);

    }
    else {
      diver(node.right,!goRight, count+1);
      diver(node.left,goRight, 0);
    }
  }
}
