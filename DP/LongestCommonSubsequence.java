public class LongestCommonSubsequence {
    public static void main(String[] args) {
     //https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/
    }



        static int SimilarText(String virat,String rohit,int n1,int n2)
        {
            if(n1==0 || n2==0)
            {
                return 0;
            }

            if(virat.charAt(n1-1)==rohit.charAt(n2-1))
            {
                return 1+SimilarText(virat,rohit,n1-1,n2-1);
            }
            else
            {
                return Math.max(SimilarText(virat,rohit,n1-1,n2),SimilarText(virat,rohit,n1,n2-1));
            }
        }

        public static void main(String[] args) throws IOException{

        //Recursion
            //TC-2^n;
            BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
            String virat=reader.readLine().trim();
            String rohit=reader.readLine().trim();


            int n1=virat.length();
            int n2=rohit.length();


            System.out.println(SimilarText(virat,rohit,n1,n2));





        }








    static int SimilarText(String virat,String rohit,int n1,int n2,int dp[][])
    {//MEMOIZATION
        //TC-n1*n2
        if(n1==0 || n2==0)
        {
            return 0;
        }
        if(dp[n1][n2]!=-1)
        {
            return dp[n1][n2];
        }
        if(virat.charAt(n1-1)==rohit.charAt(n2-1))
        {
            return dp[n1][n2]=1+SimilarText(virat,rohit,n1-1,n2-1,dp);
        }
        else
        {
            return dp[n1][n2]=Math.max(SimilarText(virat,rohit,n1-1,n2,dp),SimilarText(virat,rohit,n1,n2-1,dp));
        }
    }

    public static void main(String[] args) throws IOException{

        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String virat=reader.readLine().trim();
        String rohit=reader.readLine().trim();

        int n1=virat.length();
        int n2=rohit.length();

        int dp[][]=new int[n1+1][n2+1];
        for(int[] array:dp)
        {
            Arrays.fill(array,-1);
        }
        System.out.println(SimilarText(virat,rohit,n1,n2,dp));





    }









    public class Solution {

        //Time Complexity
        //O(m*n) as there are m*n states of dp and we are filling each one of them exactly one time.
        //
        //Space Complexity
        //O(m*n) because we created an 2-D dp of m*n size.
        public static int lcs(String s, String t) {
            int n1=s.length();
            int n2=t.length();
            int dp[][]=new int[n1+1][n2+1];
            for(int i=0;i<n1;i++)
            {
                for(int j=0;j<n2;j++)
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
                    char c1=s.charAt(i-1);
                    char c2=t.charAt(j-1);
                    if(c1==(c2))
                    {
                        dp[i][j]=1+dp[i-1][j-1];
                    }
                    else
                    {
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
            return dp[n1][n2];
        }

    }

}
