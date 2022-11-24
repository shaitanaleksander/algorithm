package org.leetcode.hashing;

import java.util.HashMap;

public class JewelsAndStones {

//    You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
//    Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
//
//    Letters are case sensitive, so "a" is considered a different type of stone from "A".
//



    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> vault = new HashMap<>();


        for (char c : stones.toCharArray()) {
            vault.computeIfPresent(c, (k, v) -> v + 1);
            vault.putIfAbsent(c,1);
        }

        int counter = 0;

        for (char c : jewels.toCharArray()) {
            counter += vault.getOrDefault(c, 0);
        }

        return counter;
    }
}
