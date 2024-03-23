package org.leetcode.trees;

import java.util.HashSet;
import java.util.Set;

public class TwoSum4 {

    private Set<Integer> vault = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;

        if (vault.contains(k - root.val)) {
            return true;
        }
        vault.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
