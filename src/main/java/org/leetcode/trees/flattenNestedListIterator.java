package org.leetcode.trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class flattenNestedListIterator {
/*

    private Queue<Integer> queue = new LinkedList<>();

    public NestedIterator(List<NestedInteger> nestedList) {
        filler(nestedList);
    }


    public Integer next() {
        return queue.remove();
    }


    public boolean hasNext() {
        return !queue.isEmpty();
    }

    private void filler(List<NestedInteger> nested){
        if (nested == null) return;

        for (NestedInteger nes : nested) {

            if (nes.isInteger()) {
                queue.offer(nes.getInteger());
            }
            else {
                filler(nes.getList());
            }
        }
    }
*/

}

/*  public interface NestedInteger {

              // @return true if this NestedInteger holds a single integer, rather than a nested list.
              public boolean isInteger();

              // @return the single integer that this NestedInteger holds, if it holds a single integer
              // Return null if this NestedInteger holds a nested list
              public Integer getInteger();

              // @return the nested list that this NestedInteger holds, if it holds a nested list
              // Return empty list if this NestedInteger holds a single integer
              public List<NestedInteger> getList();
  }*/
