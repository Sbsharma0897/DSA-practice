package Hashing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
     int[] array={8, 1 ,1, 2, 2 ,3 ,3, 3 ,4};
     int k=2;
        System.out.println(Arrays.toString(topK(array,k)));

        //Time Complexity: O(k log d + d), where d is the count of distinct elements in the array.
        //To remove the top of priority queue O(log d) time is required, so if k elements
        // are removed then O(k log d) time is required and to traverse the distinct elements
        // O(d) time is required.
        //Auxiliary Space: O(d), where d is the count of distinct elements in the array.
        //To store the elements in HashMap O(d) space complexity is needed.

    }
    static class Pair
    {
        int key;
        int val;

        public Pair(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    public static int[] topK(int[] nums, int k)
    {
       HashMap<Integer,Integer> map=new HashMap<>();

       for (int el:nums)
       {
           map.put(el,map.getOrDefault(el,0)+1);
       }
       PriorityQueue<Pair> heap=new PriorityQueue<>(
               new Comparator<Pair>() {
                   @Override
                   public int compare(Pair o1, Pair o2) {
                       if(o1.val==o2.val)
                       {
                           return o1.key-o2.key;
                       }
                       else
                       {
                           return o1.val-o2.val;
                       }
                   }
               }
       );
        for (int key:map.keySet())
        {
            Pair p=new Pair(key,map.get(key));
            heap.add(p);
            if(heap.size()>k)
            {
                heap.remove();
            }
        }
        int[] ans=new int[k];
        for (int i = k-1; i>=0; i--)
        {
          ans[i]=heap.peek().key;
          heap.remove();
        }
        return ans;
    }
}
