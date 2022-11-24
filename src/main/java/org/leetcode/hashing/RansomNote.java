package org.leetcode.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class RansomNote {

//    Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//
//    Each letter in magazine can only be used once in ransomNote.

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> characters = new HashMap<>();

        for (char c : ransomNote.toCharArray()) {
            characters.computeIfPresent(c, (k, v) -> v + 1);
            characters.putIfAbsent(c, 1);
        }

        for (Character c : magazine.toCharArray()) {
            if (characters.containsKey(c)){
                Integer value = characters.get(c);
                if (value == 1) characters.remove(c);
                else characters.computeIfPresent(c, (k, v) -> v - 1);
            }
        }
        return characters.isEmpty();
    }

}
