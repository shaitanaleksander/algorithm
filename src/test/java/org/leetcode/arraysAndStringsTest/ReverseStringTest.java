package org.leetcode.arraysAndStringsTest;

import org.junit.Assert;
import org.junit.Test;
import org.leetcode.arraysAndStrings.Reverser;

public class ReverseStringTest {

@Test
    public void reverseStringTest(){
        Reverser reverse = new Reverser();
        String sentence = "hello world!";
        char[] words = sentence.toCharArray();
        char[] expected = new StringBuilder(sentence).reverse().toString().toCharArray();

        reverse.reverseString(words);
    Assert.assertArrayEquals(words, expected);
    }
}
