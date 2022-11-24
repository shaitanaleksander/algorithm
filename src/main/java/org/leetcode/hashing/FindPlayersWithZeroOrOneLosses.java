package org.leetcode.hashing;

import java.util.*;

public class FindPlayersWithZeroOrOneLosses {

    public List<List<Integer>> findWinners(int[][] matches) {

        Set<Integer> winner = new HashSet<>();
        HashMap<Integer, Integer> looser = new HashMap<>();

        for (int[] arr: matches) {

            winner.add(arr[0]);

            if (looser.containsKey(arr[1])) looser.put(arr[1], looser.get(arr[1]) + 1);
            else looser.put(arr[1], 1);
        }

        ArrayList<Integer> top = new ArrayList<>();
        ArrayList<Integer> bottom = new ArrayList<>();


        for (Integer integer : winner) {
            if (!looser.containsKey(integer)) top.add(integer);
        }
        for (Map.Entry<Integer, Integer> loos : looser.entrySet()) {
            if (loos.getValue() == 1) bottom.add(loos.getKey());
        }

        top.sort(Integer::compareTo);
        bottom.sort(Integer::compareTo);

        return List.of(top, bottom);
    }
}
