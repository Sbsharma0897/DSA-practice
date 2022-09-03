package SlidingWindow;

public class MaxSumSubarraySizeK {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
    }
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){

        long sum=0;
        long maxsum=0;
        int i=0;
        for(int j=0;j<N;j++)
        {
            sum=sum+Arr.get(j);
            if(j-i+1>=K)
            {
                maxsum=Math.max(maxsum,sum);
                sum=sum-Arr.get(i);
                i++;
            }
        }
        return maxsum;
    }
}
