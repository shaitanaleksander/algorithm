package org.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {

  private List<List<Integer>> result = new ArrayList<>();

  public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    dive(root, new ArrayList<>(),targetSum);
    return result;
  }

  private void dive(TreeNode node, List<Integer> arr, int target) {
    if (node == null) return;

    arr.add(node.val);
    target -= node.val;

    if (node.left == null && node.right == null) {
      if (target == 0) result.add(arr);
    }


    dive(node.left, new ArrayList<>(arr),target);
    dive(node.right, new ArrayList<>(arr),target);
  }
}
