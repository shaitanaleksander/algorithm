package org.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class PathSumIII {

  private  int counter = 0;
  private int target = 0;
  public int pathSum(TreeNode root, int targetSum) {

    target = targetSum;
    dive(root, new ArrayList<>());
    return counter;

  }

  private void dive(TreeNode node, List<Integer> arr) {

    if (node == null) return;

    long con = node.val;
    if (con == target) counter++;
    for (int i = arr.size() - 1; i >= 0 ; i--) {
      con+= arr.get(i);
      if (con == target) {
        counter++;
        break;
      }

    }
    arr.add(node.val);

    dive(node.left, arr);
    dive(node.right, arr);
    arr.remove(arr.size() - 1);
  }

}
