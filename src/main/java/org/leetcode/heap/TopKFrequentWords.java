package org.leetcode.heap;

import java.util.*;

public class TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> frequents = new HashMap<>();

        for (String word : words) {
            frequents.put(word, frequents.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> queue = new PriorityQueue<>((a,b) ->{
            if (frequents.get(a).equals(frequents.get(b))) return a.compareTo(b);
            return frequents.get(a) - frequents.get(b);
        });

        for (String key : frequents.keySet()) {
            queue.add(key);
            if (queue.size() > k) queue.remove();
        }

        LinkedList<String> strings = new LinkedList<>();

        while (!queue.isEmpty()) {
            strings.addFirst(queue.remove());
        }

        strings.sort((a,b) ->{
            if (frequents.get(a).equals(frequents.get(b))) return a.compareTo(b);
            return 1;
        });
        return strings;

    }

}
