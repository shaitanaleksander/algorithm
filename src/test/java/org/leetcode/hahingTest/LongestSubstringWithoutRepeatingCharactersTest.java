package org.leetcode.hahingTest;

import org.junit.Assert;
import org.junit.Test;
import org.leetcode.hashing.LongestSubstringWithoutRepeatingCharacters;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void lengthOfLongestSubstring(){
        var longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        String input = "pwwkew";
        int expected = 3;
        int output = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);

        Assert.assertEquals(expected,output);

    }
}
