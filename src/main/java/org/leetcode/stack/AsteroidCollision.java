package org.leetcode.stack;

import java.util.Arrays;
import java.util.LinkedList;

public class AsteroidCollision {


  // positive -> negative <-

  public  static int[] asteroidCollision(int[] asteroids) {

    LinkedList<Integer> stack = new LinkedList<>();

    for (int asteroid : asteroids) {

      if (stack.isEmpty() || asteroid > stack.peek()) stack.push(asteroid);
      else if (asteroid <= 0  && stack.peek() <= 0) stack.push(asteroid);
      else if (asteroid > 0 && stack.peek() > 0) stack.push(asteroid);
      else if (asteroid > 0 && stack.peek() < 0) stack.push(asteroid);
      else {
        boolean emp = false;
        while (!stack.isEmpty()) {
          if ((stack.peek() + asteroid) > 0){
              break;
          }
          else if ((stack.peek() + asteroid) == 0){
            stack.pop();
            break;
          }
          else if (asteroid <= 0  && stack.peek() <= 0) {
            stack.push(asteroid);
            break;
          }
          else stack.pop();
          if (stack.isEmpty()) emp = true;
        }
        if (emp) stack.push(asteroid);
      }
    }
      return stack.reversed().stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {

    int[] arr = new int[]{1,-2,-2,-2};

    System.out.println(Arrays.toString(asteroidCollision(arr)));

  }

}
