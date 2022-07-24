import java.util.*;

public class KOKOeatsbanana {
    public static void main(String[] args) {
  //https://leetcode.com/problems/koko-eating-bananas/
    }
    class Solution {
        public int minEatingSpeed(int[] piles, int h) {

            Arrays.sort(piles);
            int i = 1;
            int j = piles[piles.length - 1];


            int k = -1;
            while (i <= j) {
                int mid = i + ((j - i) / 2);
                //System.out.println(mid+"mid");
                if (findK(piles, mid) <= h) {

                    k = mid;
                    //System.out.println(k);
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }
            return k;

        }

        public long findK(int[] array, int mid) {
            long hours = 0;

            for (var i = 0; i < array.length; i++) {
                if (array[i] / mid == 0) {
                    hours = hours + 1;
                } else if (array[i] / mid >= 1 && array[i] % mid == 0) {
                    hours = hours + (array[i] / mid);
                } else {
                    hours = hours + 1 + (array[i] / mid);
                }
            }
            //System.out.println(hours+"hoyrs");
            return hours;


        }
    }
}
