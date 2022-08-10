public class NStairs {
    public static void main(String[] args) {
  //https://practice.geeksforgeeks.org/problems/reach-the-nth-point5433/1

    }
    int mod=1000000007;
    public int nthPoint(int n)
    {
        //Recursion
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        return (nthPoint(n-1)+nthPoint(n-2))%mod;
    }







    public int nthPoint(int n)
    {
        //top-down
        //Complexity Analysis:
        //
        //Time Complexity: O(n)
        //
        //Auxiliary Space: O(n)
        int dp[]=new int[n+1];
        return helper(n,dp);
    }

    static public int helper(int n,int[] dp)
    {
        int mod=1000000007;
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        if(dp[n]>0)
        {
            return dp[n];
        }
        dp[n]= (helper(n-1,dp)+helper(n-2,dp))%mod;
        return dp[n];
    }







    public int nthPoint(int n)
    {
        //Tabulation
        int dp[]=new int[n+1];
        dp[0]=1;

        for(int i=1;i<n+1;i++)
        {
            int mod=1000000007;
            if(i==1)
            {
                dp[i]=dp[i-1]%mod;
            }
            else
            {
                dp[i]=(dp[i-1]+dp[i-2])%mod;
            }
        }
        return dp[n];
    }

}
