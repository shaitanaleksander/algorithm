package org.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree {

  private List<TreeNode> nodes = new ArrayList<>();
  public TreeNode increasingBST(TreeNode root) {
    dive(root);

    for (int i = 1; i < nodes.size() ; i++) {
      nodes.get(i - 1).right = nodes.get(i);
      nodes.get(i - 1).left = null;
      nodes.get(i).left = null;
    }
    return nodes.get(0);
  }

  public void dive(TreeNode node) {

    if (node == null) return;
    dive(node.left);
    nodes.add(node);
    dive(node.right);
  }
}
