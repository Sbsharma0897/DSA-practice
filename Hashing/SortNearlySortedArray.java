package Hashing;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortNearlySortedArray {
    public static void main(String[] args) {
        //https://www.geeksforgeeks.org/nearly-sorted-algorithm/
        int[] array={2,3,1,4,6,7,5,8,9};
        int n=array.length;
        int k=2;
        int index=0;

        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for (int i = 0; i < n; i++)
        {
          if(i<=k)
          {
              heap.add(array[i]);
          }
          else
          {
              array[index]=heap.peek();
              index++;
              heap.remove();
              heap.add(array[i]);
          }
        }
        while(heap.size()>0)
        {
            array[index]=heap.peek();
            index++;
            heap.remove();
        }
        System.out.println(Arrays.toString(array));
    }
}
