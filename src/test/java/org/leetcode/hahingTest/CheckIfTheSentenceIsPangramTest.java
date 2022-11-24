package org.leetcode.hahingTest;

import org.junit.Assert;
import org.junit.Test;
import org.leetcode.hashing.CheckIfTheSentenceIsPangram;

public class CheckIfTheSentenceIsPangramTest {

    @Test
    public void checkIfPangramTest(){

        CheckIfTheSentenceIsPangram checkIfTheSentenceIsPangram = new CheckIfTheSentenceIsPangram();
        String input = "thequickbrownfoxjumpsoverthelazydog";
        boolean expected = true;
        boolean output = checkIfTheSentenceIsPangram.checkIfPangram(input);
        Assert.assertEquals(expected,output);

    }
}
