public class UniquePaths {
    public static void main(String[] args) {
       //https://www.codingninjas.com/codestudio/problems/total-unique-paths_1081470?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos&leftPanelTab=0
    }

    // Time Complexity  : O(M * N)
    //    Space Complexity : O(M * N) +O(n+m)(stack space)
    public static int uniquePaths(int m, int n) {
        int[][] visited=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                visited[i][j]=0;
            }
        }
        int dp[][]=new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        int i=0;
        int j=0;
        return helper(i,j,m,n,visited,dp);
    }
    public static int helper(int i,int j,int m,int n,int[][] visited,int[][] dp)
    {
        if(i==m || j==n)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(visited[i][j]==1)
        {
            return 0;
        }
        if(i==m-1 && j==n-1)
        {
            return 1;
        }


        int down=helper(i+1,j,m,n,visited,dp);
        int right=helper(i,j+1,m,n,visited,dp);

        dp[i][j]=down+right;
        return dp[i][j];

    }






    public static int uniquePaths(int m, int n) {
        // Reference table to store subproblems.
        int[][] dp = new int[m][n];

        // Paths to reach a cell in column 1.
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        // Paths to reach a cell in row 1.
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // Bottom up approach.
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // Returning answer.
        return dp[m - 1][n - 1];
    }









}
