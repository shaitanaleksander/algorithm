package org.leetcode.graphs;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfConnectedComponentsInAnUndirectedGraphTest {

    @Test
    public void countComponentsTest(){

        var task = new NumberOfConnectedComponentsInAnUndirectedGraph();
        int n = 4;
        int[][] edges = {{2, 3}, {1, 2}, {1, 3}};
        int expected = 2;

        int output = task.countComponents(n, edges);
        Assert.assertEquals(expected, output);

    }


}
