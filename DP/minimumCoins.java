public class minimumCoins {
    public static void main(String[] args) {
      //https://practice.geeksforgeeks.org/problems/number-of-coins1824/1
    }
    public int minCoins(int coins[], int n, int v)
    {
        long dp[][]=new long[n+1][v+1];
        for(long[] array:dp)
        {
            Arrays.fill(array,-1);
        }
        int temp=(int)helper(coins,n,v,dp);
        if(temp==Integer.MAX_VALUE)
        {
            return -1;
        }
        return temp;

    }
    static long helper(int[] array,int n,int v,long dp[][] )
    {
        //This is tricky ,follow bottom one
        if(n==0)
        {
            if(v==0)
            {
                return 0;
            }
            else
            {
                return Integer.MAX_VALUE;
            }
        }
        if(dp[n][v]!=-1)
        {
            return dp[n][v];
        }
        if(array[n-1]<=v)
        {
            return dp[n][v]=Math.min(helper(array,n,v-array[n-1],dp)+1, helper(array,n-1,v,dp));
        }
        else
        {
            return dp[n][v]=helper(array,n-1,v,dp);
        }
    }







    static long Ways(int[] array,int n,int amount,long dp[][])
    {
        if(amount==0)
        {
            return 0;
        }
        if(n==0)
        {
            return Long.MAX_VALUE;

        }
        if(dp[n][amount]!=-1)
        {
            return dp[n][amount];
        }
        long take=Long.MAX_VALUE; // This is when we dont hav coins to take so we put max value to avoid
        //comparison
        if(array[n-1]<=amount)
        {
            take=Ways(array,n,amount-array[n-1],dp)+1;
        }

        long nottake=Ways(array,n-1,amount,dp);
        return dp[n][amount]=Math.min(take,nottake);


    }







    class Solution {
        public int coinChange(int[] coins, int amount) {
            int count=0;
            int dp[][]=new int[coins.length][amount+1];
            for(int[] arr:dp)
            {
                Arrays.fill(arr,-1);
                //System.out.println(dp[index][amount]);
                //System.out.println(Arrays.toString(arr));
            }
            int res= solve(coins,amount,0,dp);
            if(res>=Integer.MAX_VALUE-1)
            {
                return -1;
            }
            return res;

        }
        public static int solve(int[] coins,int amount,int index,int[][] dp)
        {

            if(amount==0)
            {
                dp[index][amount]=0;

                return 0;
            }
            if(index==coins.length)
            {
                return Integer.MAX_VALUE-1;
            }

            if(dp[index][amount]!=-1)
            {

                return dp[index][amount];
            }

            int take=Integer.MAX_VALUE;
            if(coins[index]<=amount)
            {
                take=solve(coins,amount-coins[index],index,dp)+1;


            }

            int nottake=solve(coins,amount,index+1,dp);
            return dp[index][amount]=Math.min(take,nottake);





        }
    }

}
