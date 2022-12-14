package org.leetcode.graphs;

import java.util.*;

public class MinimumGeneticMutation {

    private final Set<String> sBank = new HashSet<>();

    public int minMutation(String startGene, String endGene, String[] bank) {


        sBank.addAll(Arrays.asList(bank));

        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(startGene, 0));


        while (!queue.isEmpty()) {

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Pair pair = queue.remove();
                if (pair.mutation.equals(endGene)) {
                    return pair.step;
                }
                queue.addAll(neighbors(pair.mutation, pair.step));
            }
        }
        return -1;
    }

    private List<Pair> neighbors(String mutation, int step) {

      List<Character> gene = List.of('A','C','T','G');
        ArrayList<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < mutation.length(); i++) {
            for (char ch : gene) {
                StringBuilder string = new StringBuilder(mutation);
                string.setCharAt(i, ch);
                if (sBank.contains(string.toString())) {
                    pairs.add(new Pair(string.toString(), step + 1));
                    sBank.remove(string.toString());
                    return pairs;

                }
            }
        }
        return pairs;
    }

    static class Pair {
        public String mutation;
        public int step;

        public Pair(String mutation, int step) {
            this.mutation = mutation;
            this.step = step;
        }
    }

}
