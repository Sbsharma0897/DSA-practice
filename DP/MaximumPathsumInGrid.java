public class MaximumPathsumInGrid {
    public static void main(String[] args) {
      //https://www.codingninjas.com/codestudio/problems/maximum-path-sum-in-the-matrix_797998?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos
    }
    //Time Complexity : O(N*M)
    //    Space Complexity : O(N*M)
    public static int getMaxPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int dp[][]=new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++)
        {
            max=Math.max(max,helper(matrix,dp,n,m,0,i));
        }
        return max;
    }
    public static int helper(int[][] matrix,int[][] dp,int n,int m,int i,int j)
    {
        if(i<0 || j<0|| i==n || j==m)
        {
            return Integer.MIN_VALUE;
        }
        if(i==n-1)
        {
            return matrix[i][j];
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int max=Integer.MIN_VALUE;

        max=Math.max(max,helper(matrix,dp,n,m,i+1,j));
        max=Math.max(max,helper(matrix,dp,n,m,i+1,j+1));
        max=Math.max(max,helper(matrix,dp,n,m,i+1,j-1));


        dp[i][j]=max+matrix[i][j];
        return dp[i][j];
    }
}


}
