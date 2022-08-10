public class RodCutting {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/rod-cutting0840
        // /1?utm_source=youtube&utm_medium=collabteam_anujbhaiya&utm_campaign=rodcutting
        //Given a rod of length N inches and an array of prices, price[] that contains
        // prices of all pieces of size smaller than N. Determine the maximum value
        // obtainable by cutting up the rod and selling the pieces.
    }


    public int cutRod(int price[], int n) {
        //Recursion
        int cut=n;
        return helper(price,n,cut);
    }
    static int helper(int price[], int n,int cut)
    {
        if(cut==0)
        {
            if(n!=0)
            {
                return Integer.MIN_VALUE;
            }
            else
            {
                return 0;
            }
        }
        if(n==0)
        {
            return 0;
        }
        if(cut<=n)
        {
            int withCut=price[cut-1]+helper(price,n-cut,cut);
            int withoutCut=helper(price,n,cut-1);
            return Math.max(withCut,withoutCut);
        }
        else
        {
            return helper(price,n,cut-1);
        }
    }








    public int cutRod(int price[], int n) {
        int dp[][]=new int[n+1][n+1];
        for(int[] array:dp)
        {
            Arrays.fill(array,-1);
        }
        int cut=n;
        return helper(price,n,cut,dp);
    }
    static int helper(int price[], int n,int cut,int[][] dp)
    {
        if(cut==0)
        {
            if(n!=0)
            {
                return Integer.MIN_VALUE;
            }
            else
            {
                return 0;
            }
        }
        if(n==0)
        {
            return 0;
        }
        if(dp[n][cut]!=-1)
        {
            return dp[n][cut];
        }
        if(cut<=n)
        {
            int withCut=price[cut-1]+helper(price,n-cut,cut,dp);
            int withoutCut=helper(price,n,cut-1,dp);
            return dp[n][cut]=Math.max(withCut,withoutCut);
        }
        else
        {
            return dp[n][cut]=helper(price,n,cut-1,dp);
        }
    }
}
