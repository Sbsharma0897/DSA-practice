import java.util.*;
public class NumberOfSubarraysWIthSumZero {
    public static void main(String[] args) {
        //Zero Sum Subarrays
        //You are given an array arr[] of size n. Find the total count of sub-arrays having their sum equal to 0.

    }
    public static long findSubarray(long[] arr ,int n)
    {
        long count=0;
        long sum=0;
        HashMap<Long,Integer> map=new HashMap<>();
        long zero=0;
        map.put(zero,1);
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            //
            if(map.containsKey(sum) && map.get(sum)>=1)
            {

                count=count+map.get(sum);
                //System.out.println(sum+" "+arr[i]);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        //System.out.println(map);
        return count;
    }
}
