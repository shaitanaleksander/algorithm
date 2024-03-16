package org.leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {

  public List<Double> averageOfLevels(TreeNode root) {

    ArrayList<Double> result = new ArrayList<>();
    Queue<TreeNode> nodes = new LinkedList<>();
    nodes.add(root);


    while (!nodes.isEmpty()) {

      float size = nodes.size();

      double average = 0;
      for (int i = 0; i < size; i++) {
        TreeNode node = nodes.remove();

        average += node.val;

        if (node.left != null) nodes.offer(node.left);
        if (node.right != null) nodes.offer(node.right);
      }
      result.add(average / size);
    }

    return result;
  }

}
