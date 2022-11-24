package org.leetcode.hashing;

import java.util.HashMap;

public class MaximumNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {

        String keyword = "balloon";
        HashMap<Character, Integer> appearance = new HashMap<>();

        for (Character ch: text.toCharArray()) {
            appearance.computeIfPresent(ch, (key, value) -> value + 1);
            appearance.putIfAbsent(ch, 1);
        }

        int result = Integer.MAX_VALUE;

        for (Character ch: keyword.toCharArray()) {

            if (appearance.containsKey(ch)) {
                Integer appeared = appearance.get(ch);
                if (ch.equals('l') || ch.equals('o')) appeared /=2;
                result = Math.min(appeared, result);
            }
            else return 0;
        }

        return result;
    }

}
