package org.leetcode.hahingTest;

import org.junit.Assert;
import org.junit.Test;
import org.leetcode.hashing.FindPlayersWithZeroOrOneLosses;

import java.util.List;

public class FindPlayersWithZeroOrOneLossesTest {

    @Test
    public  void findWinners(){
        FindPlayersWithZeroOrOneLosses findPlayersWithZeroOrOneLosses = new FindPlayersWithZeroOrOneLosses();
        int[][] pair = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        List<List<Integer>> expected = List.of(List.of(1, 2, 10), List.of(4, 5, 7, 8));

        List<List<Integer>> winners = findPlayersWithZeroOrOneLosses.findWinners(pair);

        System.out.println(winners);



    }
}
