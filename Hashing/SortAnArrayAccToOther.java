package Hashing;
import java.util.*;
public class SortAnArrayAccToOther {
    public static void main(String[] args) {
     //https://practice.geeksforgeeks.org/problems/relative-sorting4323/1
        //Given two integer arrays A1[ ] and A2[ ] of size N and M respectively.
        // Sort the first array A1[ ] such that all the relative positions
        // of the elements in the first array are the same as the elements in the second array A2[ ].
    }

    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        //Here we have used treemap which sorts based on keys, we can also use hashmap and then put element in
        //array and sort but it is not recommeded.

        TreeMap<Integer,Integer> map=new TreeMap<>();

        for(int el:A1)
        {
            map.put(el,map.getOrDefault(el,0)+1);
        }
        int[] ans=new int[N];
        int index=0;
        for(int el:A2)
        {
            if(map.containsKey(el))
            {
                int n=map.get(el);
                for(int i=1;i<=n;i++)
                {
                    ans[index]=el;
                    index++;
                }
                map.remove(el);
            }
        }

        for(int el:map.keySet())
        {
            if(map.get(el)!=0)
            {
                int n=map.get(el);
                for(int i=1;i<=n;i++)
                {
                    ans[index]=el;
                    index++;

                }

            }
        }

        return ans;



    }
}
