package org.leetcode.hahingTest;

import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;
import org.leetcode.hashing.RansomNote;

public class RansomNoteTest {

    @Test
    public void canConstruct(){

        RansomNote ransomNote = new RansomNote();
        String ransom = "aab", magazine = "baa";
        boolean expected = true;
        boolean output = ransomNote.canConstruct(ransom, magazine);
        Assert.assertEquals(expected,output);

    }
}
