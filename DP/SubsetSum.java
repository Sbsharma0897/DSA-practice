import java.util.*;

public class SubsetSum {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1
     //Given an array of non-negative integers, and a value sum, determine if there is a
        // subset of the given set with sum equal to given sum.
    }
    static Boolean isSubsetSumONE(int N, int arr[], int sum){

        //Memoization
        //Complexity Analysis:
        //
        //Time Complexity: O(sum*n), where sum is the ‘target sum’ and ‘n’ is the size of array.
        //Auxiliary Space: O(sum*n) + O(n) -> O(sum*n) = the size of 2-D
        // array is sum*n and O(n)=auxiliary stack space.
        int[][] dp=new int[N][sum+1];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                dp[i][j]=-1;
            }
        }

        if(helper(N-1,arr,sum,dp)==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    static int helper(int index, int arr[], int sum,int[][] dp)
    {
        if(index<0)
        {
            if(sum==0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        if(sum==0)
        {
            return 1;
        }
        if(dp[index][sum]!=-1)
        {
            return dp[index][sum];
        }


        if(arr[index]<=sum)
        {
            int include=helper( index-1,  arr,  sum-arr[index],dp);
            int exclude=helper( index-1,  arr,  sum,dp);

            if(include!=0 || exclude !=0)
            {
                return dp[index][sum]=1;
            }
            else
            {
                return dp[index][sum]=0;
            }
        }
        return dp[index][sum]=helper( index-1,  arr,  sum,dp);

    }

    static Boolean isSubsetSum(int N, int arr[], int sum){

        boolean dp[][]=new boolean[N+1][sum+1];

        for(int j=0;j<sum+1;j++)
        {
            dp[0][j]=false;
        }
        for(int i=0;i<N+1;i++)
        {
            dp[i][0]=true;
        }

        for(int i=1;i<N+1;i++)
        {
            for(int j=1;j<sum+1;j++)
            {
                if(arr[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[N][sum];

    }
}
