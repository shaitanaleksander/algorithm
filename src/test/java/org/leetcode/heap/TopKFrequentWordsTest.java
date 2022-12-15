package org.leetcode.heap;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TopKFrequentWordsTest {

    @Test
    public void topKFrequentTest() {
        TopKFrequentWords topKFrequentWords = new TopKFrequentWords();
        String[] arr = new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k = 4;
        List<String> expected = List.of("the","is","sunny","day");
        List<String> strings = topKFrequentWords.topKFrequent(arr, k);
        Assert.assertEquals(expected,strings);
    }
}
