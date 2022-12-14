package org.leetcode.graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int counter = 1;

        while (!queue.isEmpty()) {
            queue.forEach(wordList::remove);
            int size = queue.size();
            for (int i = 0; i < size; i++) {

                String word = queue.remove();

                if (word.equals(endWord)) return  counter;

                for (String next : wordList) {

                    int dif = 0;
                    for (int j = 0; j < word.length(); j++) {
                        if (word.charAt(j) != next.charAt(j)){
                            dif++;
                            if (dif > 1) break;
                        }
                    }

                    if (dif == 1) queue.add(next);

                }
            }
            counter++;
        }
        return 0;
    }

}
