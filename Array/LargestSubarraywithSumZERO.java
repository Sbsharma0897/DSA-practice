import java.util.*;
public class LargestSubarraywithSumZERO {
    public static void main(String[] args) {
        //https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
        //Given an array having both positive and negative integers. The task is to compute
        // the length of the largest subarray with sum 0
        //https://www.youtube.com/watch?v=xmguZ6GbatA
    }
    int maxLen(int arr[], int n)
    {
        int maxlen=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0 && maxlen==0)
            {
                maxlen=1;
            }

            sum=sum+arr[i];
            if(sum==0)
            {
                maxlen=i+1;
            }
            if(map.containsKey(sum))
            {
                if(i-map.get(sum)>maxlen)
                {
                    maxlen=i-map.get(sum);
                }
            }
            else  //here you dont add sum in map if it is already present as we need the maximum
                        // length of the subarrays woith sum 0;
            {
                map.put(sum,i);
            }

        }
        //System.out.println(map);
        return maxlen;
    }
}
