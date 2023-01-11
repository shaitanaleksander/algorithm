package org.leetcode.backtracking;

import org.junit.Test;

import java.util.List;

public class LetterCombinationsOfaPhoneNumberTest {

    @Test
    public void letterCombinations() {

        var test = new LetterCombinationsOfaPhoneNumber();
        String input = "23";
        List<String> strings = test.letterCombinations(input);
        System.out.println(strings);

    }
}
