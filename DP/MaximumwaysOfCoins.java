import java.util.Arrays;

public class MaximumwaysOfCoins {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/coin-change2448/1
    }

    public long count(int S[], int m, int n) {

        //Recursion
        return helper(S,m,n);
    }
    static int helper(int[] array,int m,int n )
    {
        if(m==0)
        {
            if(n==0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }

        if(array[m-1]<=n)
        {
            return helper(array,m,n-array[m-1])+ helper(array,m-1,n);
        }
        else
        {
            return helper(array,m-1,n);
        }
    }






    public long count(int S[], int m, int n) {

        long dp[][]=new long[m+1][n+1];
        for(long[] array:dp)
        {
            Arrays.fill(array,-1);
        }
        return helper(S,m,n,dp);
    }
    static long helper(int[] array,int m,int n,long dp[][] )
    {
        if(m==0)
        {
            if(n==0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        if(dp[m][n]!=-1)
        {
            return dp[m][n];
        }
        if(array[m-1]<=n)
        {
            return dp[m][n]=helper(array,m,n-array[m-1],dp)+ helper(array,m-1,n,dp);
        }
        else
        {
            return dp[m][n]=helper(array,m-1,n,dp);
        }
    }


}
