package org.leetcode.graphs;

import org.junit.Assert;
import org.junit.Test;

public class FindifPathExistsinGraphTest {

    @Test
    public void validPath(){
        FindifPathExistsinGraph task = new FindifPathExistsinGraph();
        int n = 6;
        int[][] edges = {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        int source = 0;
        int destination = 5;
        boolean expected = false;

        boolean result = task.validPath(n, edges, source, destination);

        Assert.assertEquals(expected, result);

    }
}
