public class LongestCommonSubstring {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/longest-common-substring1452/1

    }
    int longestCommonSubstr(String virat, String rohit, int n1, int n2){
//Recursion

        int count=0;
        return SimilarText(virat,rohit,n1,n2,dp,count);
    }

    static int SimilarText(String virat,String rohit,int n1,int n2,int count)
    {
        if(n1==0 || n2==0)
        {
            return count;
        }

        if(virat.charAt(n1-1)==rohit.charAt(n2-1))
        {
            count=SimilarText(virat,rohit,n1-1,n2-1,dp,count+1);

        }
        int a=SimilarText(virat,rohit,n1-1,n2,dp,0);
        int b=SimilarText(virat,rohit,n1,n2-1,dp,0);

        return Math.max(count,Math.max(a,b));

    }






    import java.util.* ;
import java.io.*;
    public class Solution {
        public static int lcs(String str1, String str2) {
            int n1=str1.length();
            int n2=str2.length();
            int dp[][]=new int[n1+1][n2+1];
            for(int i=0;i<=n1;i++)
            {
                for(int j=0;j<=n2;j++)
                {
                    dp[i][j]=-1;
                }
            }
            for(int i=0;i<=n1;i++)
            {
                dp[i][0]=0;
            }
            for(int i=0;i<=n2;i++)
            {
                dp[0][i]=0;
            }
            for(int i=1;i<=n1;i++)
            {
                for(int j=1;j<=n2;j++)
                {
                    char c1=str1.charAt(i-1);
                    char c2=str2.charAt(j-1);
                    if(c1==(c2))
                    {
                        dp[i][j]=1+dp[i-1][j-1];
                    }
                    else
                    {
                        dp[i][j]=0;
                    }
                }
            }
            int max=0;
            for(int i=0;i<=n1;i++)
            {
                for(int j=0;j<=n2;j++)
                {
                    max=Math.max(max,dp[i][j]);
                }
            }
            return max;

        }
    }
}
