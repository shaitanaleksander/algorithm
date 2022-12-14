package org.leetcode.statckTest;

import org.junit.Assert;
import org.junit.Test;
import org.leetcode.stack.SimplifyPath;

public class SimplifyPathTest {

    @Test
    public void simplifyPathTest(){
        SimplifyPath simplifyPath = new SimplifyPath();
        String input = "/a//b////c/d//././/..";
        String expected = "/a/b/c";
        String output = simplifyPath.simplifyPath(input);

        Assert.assertEquals(expected,output);

    }
}
