package Hashing;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElements {
    public static void main(String[] args) {

        int K=3;
        int[] array={4,3,7,8,12,34,6,78,32,56,12};
//       heap(array,K);
     heapBetter(array,K);
    }
    static void heap(int[] array,int K)
    {
        // In this we are making a heap of size N which is not required as using second
        //approach we can make it size k.
        //time-O(NLOGN)
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < array.length; i++)
        {
            heap.add(array[i]);
        }
        int[] ans=new int[K];
        for (int i = 0; i < K; i++)
        {
            ans[i]=heap.peek();
            heap.remove();
        }
        System.out.println(Arrays.toString(ans));
    }

    static void heapBetter(int[] array,int K)
    {
        //Time-NlogK, N for loopm and logK for adding and removing element from heap
        //space-K
        //This is best approach
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for (int i = 0; i < array.length; i++)
        {
            if(i<K)
            {
                heap.add(array[i]);
            }
            else
            {
                if(heap.peek()<array[i])
                {
                    heap.remove();
                    heap.add(array[i]);
                }
            }

        }

        System.out.println(heap);
    }

}
