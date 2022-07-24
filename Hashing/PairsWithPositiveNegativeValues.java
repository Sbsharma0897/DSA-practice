package Hashing;

import java.util.*;
public class PairsWithPositiveNegativeValues {
    public static void main(String[] args) {
        //https://practice.geeksforgeeks.org/problems/pairs-with-positive-negative-values3719/1
    }
    public long[] PosNegPair(long a[], long n)
    {
        ArrayList<Long> ans=new ArrayList<>();
        Arrays.sort(a);

        HashMap<Long,Integer> map=new HashMap<>();

        for(long el:a)
        {
            map.put(el,map.getOrDefault(el,0)+1);
        }
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=0)
            {
                index=i-1;
                break;
            }

        }
        for(int i=index;i>=0;i--)
        {
            long minusvalue=a[i];
            long positivevalue= -minusvalue;
            if(map.containsKey(positivevalue))
            {
                if(map.get(positivevalue)==1)
                {
                    map.remove(positivevalue);
                }
                else
                {
                    map.put(positivevalue,map.get(positivevalue)-1);
                }
                ans.add(minusvalue);
                ans.add(positivevalue);
            }
        }


        long[] result=new long[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            result[i]=ans.get(i);
        }
        return result;
    }
}
