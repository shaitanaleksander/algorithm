package org.leetcode.graphs;

import org.junit.Assert;
import org.junit.Test;

public class MinimumGeneticMutationTest {

    @Test
    public void minMutationTest(){
        var minimumGeneticMutation = new MinimumGeneticMutation();
        String startGene = "AACCGGTT";
        String endGene = "AAACGGTA";
        String[] bank = {"AACCGATT","AACCGATA","AAACGATA","AAACGGTA"};
        int expected = 4;
        int realResult = minimumGeneticMutation.minMutation(startGene, endGene, bank);
        Assert.assertEquals(expected, realResult);

    }

}
