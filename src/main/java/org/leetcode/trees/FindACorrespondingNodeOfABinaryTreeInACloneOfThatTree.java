package org.leetcode.trees;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {

  public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
    if (original == null) return null;
    if (original == target) return cloned;
    TreeNode targetCopy = getTargetCopy(original.left, cloned.left, target);
    return targetCopy == null? getTargetCopy(original.right, cloned.right, target): targetCopy;
  }
}
