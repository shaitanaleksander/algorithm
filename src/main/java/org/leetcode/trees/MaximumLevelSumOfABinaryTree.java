package org.leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumOfABinaryTree {
  public int maxLevelSum(TreeNode root) {

     int max = Integer.MIN_VALUE;
     int resultL = 0;
     int level = 0;

    Queue<TreeNode> nodes = new LinkedList<>();
    nodes.add(root);

    while (!nodes.isEmpty()) {

      int size = nodes.size();

      int sum = 0;
      for (int i = 0; i < size ; i++) {

        TreeNode node = nodes.remove();

        sum+= node.val;

        if (node.left != null) nodes.offer(node.left);
        if (node.right != null) nodes.offer(node.right);

      }

      if (sum > max){
        max = sum;
        resultL = level;
      }
      level++;
    }
    return resultL;
  }
}
