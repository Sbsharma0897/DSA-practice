public class LCS {
    public static void main(String[] args) {
        class Solution
        {
            //Function to find the length of longest common subsequence in two strings.
            static int lcs(int x, int y, String s1, String s2)
            {
                int[][] dp=new int[x][y];
                for(int[] arr:dp)
                {
                    Arrays.fill(arr,-1);
                }
                return solve(s1,s2,x,y,0,0,dp);
            }
            static int solve(String one,String two,int x,int y,int i,int j,int[][] dp)
            {
                if(i>=x || j>=y)
                {
                    return 0;
                }

                if(dp[i][j]!=-1)
                {
                    return dp[i][j];
                }
                int ans=0;
                if(one.charAt(i)==two.charAt(j))
                {
                    ans= solve(one,two,x,y,i+1,j+1,dp)+1;
                }
                else
                {
                    int a1=solve(one,two,x,y,i,j+1,dp);
                    int a2=solve(one,two,x,y,i+1,j,dp);
                    ans=Math.max(a1,a2);

                }
                dp[i][j]=ans;
                return ans;
            }

        }
}
