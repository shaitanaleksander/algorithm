package org.leetcode.trees;

public class DeleteNodeInABST {


  public TreeNode deleteNode(TreeNode root, int key) {
    if (root != null &&  root.val == key && root.left == null && root.right == null ) return null;
    search(null,root,key);
    return root;
  }


  private void search(TreeNode parent, TreeNode node, int key) {
    if (node == null) return;

    if (key == node.val) {
      if (node.right == null && node.left != null) {
        node.val = node.left.val;
        TreeNode node1 = node.left.right;
        node.left = node.left.left;
        node.right = node1;
      } else if (node.right != null) {
        node.val = node.right.val;
        TreeNode left = lastLeft(node.right.left);

        if (left == null) {
          node.right.left = node.left;
        } else left.left = node.left;

        node.left = node.right.left;
        node.right = node.right.right;
      } else {
        if (parent.left == node) parent.left = null;
        else parent.right = null;
      }
    }
    else{
      if (node.val < key) search(node, node.right,key);
      else  search(node, node.left,key);
    }
  }

  private TreeNode lastLeft(TreeNode node) {
    if (node == null || node.left == null) return node;
    else return lastLeft(node.left);
  }

}
