public class DistinctOCcurerences {
    public static void main(String[] args) {
 //https://practice.geeksforgeeks.org/problems/distinct-occurrences/1

    }
    static int mod=1000000007;
    int  subsequenceCount(String S, String T)
    {
        //MEMOIZATIOn-n*m
        //This is will give a error of stack over flow in OJ so instead use TABULATION
        int b=S.length();
        int s=T.length();
        int dp[][]=new int[b+1][s+1];
        for(int[] array:dp)
        {
            Arrays.fill(array,-1);
        }
        return helper(S,T,b,s,dp);

    }
    static int helper(String big,String small,int b,int s,int[][] dp)
    {
        if(s==0)
        {
            return 1;
        }
        if(b==0)
        {
            return 0;
        }
        if(dp[b][s]!=-1)
        {
            return dp[b][s];
        }

        if(big.charAt(b-1)==small.charAt(s-1))
        {
            return dp[b][s]=(helper(big,small,b-1,s-1,dp)+helper(big,small,b-1,s,dp))%mod;
        }
        else
        {
            return dp[b][s]=helper(big,small,b-1,s,dp)%mod;
        }
    }








    static long helper(String big,String small,int b,int s,long[][] dp)
    {

        for(int i=0;i<=b;i++)
        {
            for(int j=0;j<=s;j++)
            {

                if(j==0)
                {
                    dp[i][j]=1;
                }
                else if(i==0)
                {
                    dp[i][j]=0;
                }
                else  if(big.charAt(i-1)!=small.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
                }
            }
        }
        return dp[b][s];


    }

    public static void main(String[] args) throws IOException{

        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(reader.readLine().trim());
        while(t!=0)
        {
            String line1[]=reader.readLine().trim().split(" ");
            int b =Integer.parseInt(line1[0]);
            int s=3;

            String big=reader.readLine().trim();
            String small="EVE";


            long dp[][]=new long[b+1][s+1];
            for(long[] array:dp)
            {
                Arrays.fill(array,-1);
            }
            System.out.println(helper(big,small,b,s,dp));
            t--;
        }

    }

}
