package org.leetcode.graphs;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class WordLadderTest {

    @Test
    public void ladderLengthTest() {
        WordLadder wordLadder = new WordLadder();
        String startWord = "hit";
        String endWord = "cog";
        List<String> bank = new ArrayList<>() {

            {
                add("hot");
                add("dot");
                add("dog");
                add("lot");
                add("log");
                add("cog");
            }

        };

        int expected = 5;

        int result = wordLadder.ladderLength(startWord, endWord, bank);

        Assert.assertEquals(expected, result);

    }
}
