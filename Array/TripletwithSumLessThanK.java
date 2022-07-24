import java.util.*;

public class TripletwithSumLessThanK {
    public static void main(String[] args) {
        //https://practice.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1
        //Given an array arr[] of distinct integers of size N and a value sum, the task is to find the
        // count of triplets (i, j, k), having (i<j<k)
        // with the sum of (arr[i] + arr[j] + arr[k]) smaller than the given value sum.
    }
    long countTriplets(long arr[], int n,int sum)
    {
        Arrays.sort(arr);

        long count=0;

        for(int i=0;i<n;i++)
        {
            long rem=sum-arr[i];

            int l=i+1;
            int r=n-1;
            while(l<r)
            {
                if(arr[l]+arr[r]<rem)
                {
                    count=count+(r-l);
                    l++;
                }
                else
                {
                    r--;
                }

            }
        }
        return count;
    }


}
