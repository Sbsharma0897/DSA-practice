public class ShortestCommonSUperSequence {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/shortest-common-supersequence0322/1
    }
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {

        int[][] dp=new int[m+1][n+1];
        for(int[] array:dp)
        {
            Arrays.fill(array,-1);
        }

        int common=helper(X,Y,m,n,dp);
        return m+n-common;

    }
    static int helper(String X,String Y,int m,int n,int[][] dp)
    {
        if(m==0 || n==0)
        {
            return 0;
        }
        if(dp[m][n]!=-1)
        {
            return dp[m][n];
        }
        if(X.charAt(m-1)==Y.charAt(n-1))
        {
            return dp[m][n]=1+helper(X,Y,m-1,n-1,dp);
        }
        else
        {
            return dp[m][n]=Math.max(helper(X,Y,m-1,n,dp),helper(X,Y,m,n-1,dp));
        }
    }
}
