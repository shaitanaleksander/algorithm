package org.leetcode.trees;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class LeafSimilarTrees {
  private ArrayList<Integer> left = new ArrayList();
  private ArrayList<Integer> right = new ArrayList();

  public boolean leafSimilar(TreeNode root1, TreeNode root2) {

    diver(root1, left);
    diver(root2, right);

    System.out.println(left);
    System.out.println(right);

    return left.equals(right);
  }

  private void diver(TreeNode node, ArrayList<Integer> collector) {
    if (node == null) return;
    if (node.right == null && node.left == null) {
      collector.add(node.val);
      return;
    }
    diver(node.left,collector);
    diver(node.right,collector);
  }
}
