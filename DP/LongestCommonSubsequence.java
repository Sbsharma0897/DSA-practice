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

}
