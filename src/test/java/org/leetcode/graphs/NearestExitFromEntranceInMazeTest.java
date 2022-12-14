package org.leetcode.graphs;

import org.junit.Assert;
import org.junit.Test;

public class NearestExitFromEntranceInMazeTest {

    @Test
    public void nearestExitTest(){

        var task = new NearestExitFromEntranceInMaze();
        char[][] maze = {{'+', '+', '.', '+'}, {'.', '.', '.', '+'}, {'+', '+', '+', '.'}};
        int [] entrance = {1,2};
        int expected = 1;
        int output = task.nearestExit(maze, entrance);

        Assert.assertEquals(expected, output);
    }

}
