package org.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class FindAlllTheLonelyNodes {

  private List<Integer> result = new ArrayList<>();

  public List<Integer> getLonelyNodes(TreeNode root) {

     boolean orphan = root.left == null || root.right == null;
    dive(root.left, orphan);
    dive(root.right, orphan);
    return result;
  }

  private void dive(TreeNode root, boolean orphan) {

    if (root == null) return;
    if (orphan){
      result.add(root.val);
    }

    if (root.left == null || root.right == null){
      orphan = true;
    }
    else orphan = false;

    dive(root.left, orphan);
    dive(root.right, orphan);
  }

}
