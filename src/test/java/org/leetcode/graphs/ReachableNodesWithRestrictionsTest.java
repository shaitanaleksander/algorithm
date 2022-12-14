package org.leetcode.graphs;

import org.junit.Assert;
import org.junit.Test;

public class ReachableNodesWithRestrictionsTest {

    @Test
    public void reachableNodes() {
        var task = new ReachableNodesWithRestrictions();
        int[][] arr = {{0,1},{1,2},{3,1},{4,0},{0,5},{5,6},{4,5}};
        int[] restricted = {4, 5};
        int n = 7;
        int expected = 4;
        int output = task.reachableNodes(n, arr, restricted);
        Assert.assertEquals(expected, output);
    }
}
