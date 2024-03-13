package org.leetcode.linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {

  public static String predictPartyVictory(String senate) {

    LinkedList<Character> queue = new LinkedList<>();
    int rcount = 0, dcount = 0;

    for (char c : senate.toCharArray()) {
      if (c == 'R') rcount++;
      else dcount++;
      queue.add(c);
    }

    int rban = 0, dban = 0;
    while (rcount > 0 && dcount > 0) {

      char senator = queue.pop();

      if (senator == 'R') {
        if (rban > 0) {
          rban--;
          rcount--;
        }
        else {
          dban++;
          queue.add(senator);
        }
      }
      else {
        if (dban > 0){
          dban--;
          dcount--;
        }
        else {
          rban++;
          queue.add(senator);
        }
      }
    }
    return rcount > 0 ? "Radiant" : "Dire";
  }


  public static void main(String[] args) {
    System.out.println(predictPartyVictory("RRDDD"));
  }
}
