package org.leetcode.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {


    public int lengthOfLongestSubstring(String s) {

        int result = 0;
        HashMap<Character, Integer> vault = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (vault.containsKey(s.charAt(i))) {

                int index = vault.get(s.charAt(i));

                vault.entrySet().removeIf(k -> k.getValue() >= index);
                vault.put(s.charAt(i), i);

            } else {

                vault.put(s.charAt(i), i);
                result = Math.max(result, vault.size());
            }

        }
        return result;
    }
}
