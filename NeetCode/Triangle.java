public class Triangle {
    //https://leetcode.com/problems/triangle/
    class Solution {
        public int minimumTotal(List<List<Integer>> triangle) {

            int n=triangle.size();
            int m=triangle.get(n-1).size();

            int i=0;
            int j=0;
            int[][] dp=new int[n][m];
            for(int[] arr:dp)
            {
                Arrays.fill(arr,-1);
            }
            return solve(triangle,i,j,dp);


        }
        public static int solve(List<List<Integer>> triangle,int i,int j,int[][] dp)
        {

            if(i==triangle.size())
            {

                return 0;
            }
            if(j>=triangle.get(i).size())
            {
                return Integer.MAX_VALUE;
            }
            if(dp[i][j]!=-1)
            {
                return dp[i][j];

            }
            int a=solve(triangle,i+1,j,dp)+triangle.get(i).get(j);
            //System.out.println(a+" a");
            int b=solve(triangle,i+1,j+1,dp)+triangle.get(i).get(j);
            // System.out.println(b+" b");
            //System.out.println(Math.min(a,b)+" ans");

            return dp[i][j]=Math.min(a,b);
        }
    }
}
