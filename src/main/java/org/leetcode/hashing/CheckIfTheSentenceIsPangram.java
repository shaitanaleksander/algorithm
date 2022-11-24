package org.leetcode.hashing;

import java.util.HashSet;

public class CheckIfTheSentenceIsPangram {

    public boolean checkIfPangram(String sentence) {

        int a = 97;
        HashSet<Character> collector = new HashSet<>();
        for (Character c: sentence.toCharArray()) {
            collector.add(c);
        }

        while (a < 123) {
            if (!collector.contains((char)a++)) return false;
        }
        return true;
    }
}
