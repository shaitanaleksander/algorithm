package org.leetcode.arraysAndStrings;

public class VsnPlaceFlowers {

  public static boolean canPlaceFlowers(int[] flowerbed, int n) {

    if (n == 0) return true;
    if (flowerbed.length == 1) return flowerbed[0] == 0;

    if (flowerbed[0] == 0 && flowerbed[1] == 0) n--;

    int counter = 0;

    for (int i = 1; i < flowerbed.length; i++) {

      if (flowerbed[i] == 0) {
        counter++;
        if (counter == 3){
          counter = 1;
          n --;
        }

      }
      else counter = 0;
    }
    if (counter == 2) n--;

    return n <= 0;

  }

  public static void main(String[] args) {

    int[] arr = new int[]{1,0,0,0,1,0,0};


    System.out.println(canPlaceFlowers(arr, 2));
  }

}
