package org.leetcode.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindModeInBinarySearchTree {

    private Map<Integer, Integer> vault = new HashMap<>();

    public int[] findMode(TreeNode root) {

        dfs(root);
        List<Integer> result = new ArrayList<>();
        Map.Entry<Integer, Integer> max = null;
        for (Map.Entry<Integer, Integer> entry : vault.entrySet()) {
             if (max == null || max.getValue() < entry.getValue()) {
                 result = new ArrayList<>();
                 result.add(entry.getKey());
                 max = entry;
            }
             if (max.getValue() == entry.getValue()){
                 result.add(entry.getKey());
             }
        }

        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }

    private void dfs(TreeNode node) {
        if (node == null) return;

        vault.put(node.val, vault.getOrDefault(node.val, 0) + 1);

        dfs(node.left);
        dfs(node.right);
    }

}
