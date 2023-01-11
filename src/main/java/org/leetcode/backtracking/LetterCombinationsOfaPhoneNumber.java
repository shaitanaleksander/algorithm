package org.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfaPhoneNumber {

    private final Map<Character, String> phoneButtons = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz");

    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;
        backtracking(new StringBuilder(), ans, 0, digits);
        return ans;
    }

    private void backtracking(StringBuilder temp, List<String> ans, int level, String digits) {

        if (temp.length() == digits.length()) {
            ans.add(temp.toString());
            return;
        }

        for (Character c : phoneButtons.get(digits.charAt(level)).toCharArray()) {
            temp.append(c);
            backtracking(temp, ans, level + 1, digits);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
