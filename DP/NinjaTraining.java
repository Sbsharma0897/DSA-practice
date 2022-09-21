public class NinjaTraining {
    public static void main(String[] args) {
      //https://www.codingninjas.com/codestudio/problems/ninja-s-training_3621003?leftPanelTab=2
    }
    public class Solution {
        public static int ninjaTraining(int n, int points[][]) {

            int dp[][]=new int[n+1][3];

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j < 3; j++) {
                    dp[i][j] = -1;
                }
            }
            int ans=0;
            ans=Math.max(ans,helper(n,points,0,dp,0));
            ans=Math.max(ans,helper(n,points,0,dp,1));
            ans=Math.max(ans,helper(n,points,0,dp,2));

            return ans;
        }
        public static int helper(int n,int[][] points,int index,int[][] dp,int col)
        {
            if(index>=n)
            {
                return 0;
            }
            if(dp[index][col]!=-1)
            {
                return dp[index][col];
            }
            int mx=0;
            if(col==0)
            {
                int first=helper(n,points,index+1,dp,1);
                int second=helper(n,points,index+1,dp,2);
                mx=Math.max(first,second);
            }
            if(col==1)
            {
                int first=helper(n,points,index+1,dp,0);
                int second=helper(n,points,index+1,dp,2);
                mx=Math.max(first,second);
            }
            if(col==2)
            {
                int first=helper(n,points,index+1,dp,0);
                int second=helper(n,points,index+1,dp,1);
                mx=Math.max(first,second);
            }
            dp[index][col]=mx+points[index][col];
            return dp[index][col];
        }

    }








    public static int ninjaTraining(int n, int points[][]) {
        // DP table to memoize the solution.
        int dp[][] = new int[n + 1][4];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 4; j++) {
                dp[i][j] = -1;
            }
        }

        for (int i = 0; i < n; i++) {

            if (i == 0) {
                dp[i][1] = points[i][0];
                dp[i][2] = points[i][1];
                dp[i][3] = points[i][2];
                continue;
            }

            dp[i][1] = Math.max(dp[i - 1][2], dp[i - 1][3]) + points[i][0];
            dp[i][2] = Math.max(dp[i - 1][1], dp[i - 1][3]) + points[i][1];
            dp[i][3] = Math.max(dp[i - 1][1], dp[i - 1][2]) + points[i][2];
        }

        int ans = 0;
        ans = Math.max(ans, dp[n - 1][1]);
        ans = Math.max(ans, dp[n - 1][2]);
        ans = Math.max(ans, dp[n - 1][3]);
        return ans;
    }
}
