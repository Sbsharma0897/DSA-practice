public class TargetSum {
    public static void main(String[] args) {
     //https://practice.geeksforgeeks.org/problems/target-sum-1626326450/0?f
        // bclid=IwAR23ImBXxUeHmTcjMzmUdgir1YbdwDLQKw18XKe1rcRWpj2d5YxCaZduPwA
    }
    static int findTargetSumWays(int[] A , int N, int target) {
        //Recursion
        if(N==0)
        {
            if(target==0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }

        return findTargetSumWays(A,N-1,target-A[N-1]) +findTargetSumWays(A,N-1,target+A[N-1]);

    }







    static int findTargetSumWays(int[] A , int N, int target) {
//Memoization
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum=sum+A[i];
        }
        if(target>sum)
        {
            return 0;
        }
        int s1=(target+sum)/2;

        if((target+sum)%2!=0)
        {
            return 0;
        }

        int dp[][]=new int[N+1][s1+1];
        for(int[] dummy:dp)
        {
            Arrays.fill(dummy,-1);
        }

        return helper(A,N,s1,dp);

    }

    static int helper(int[] A,int N,int sum,int[][] dp)
    {


        if(N==0)
        {
            if(sum==0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        if(dp[N][sum]!=-1)
        {
            return dp[N][sum];
        }

        if(A[N-1]<=sum)
        {
            int a= helper(A,N-1,sum-A[N-1],dp);
            int b= helper(A,N-1,sum,dp);

            return dp[N][sum]=a+b;
        }
        else
        {
            return dp[N][sum]= helper(A,N-1,sum,dp);
        }
    }







    static int findTargetSumWays(int[] A , int N, int target) {

        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum=sum+A[i];
        }
        if(target>sum)
        {
            return 0;
        }
        int s1=(target+sum)/2;

        if((target+sum)%2!=0)
        {
            return 0;
        }

        int dp[][]=new int[N+1][s1+1];
        for(int[] dummy:dp)
        {
            Arrays.fill(dummy,-1);
        }

        return helper(A,N,s1,dp);

    }

    static int helper(int[] A,int N,int sum,int[][] dp)
    {

        for(int i=0;i<N+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                if(i==0)
                {
                    dp[i][j]=0;
                }
                if(j==0)
                {
                    dp[i][j]=1;
                }
            }
        }
        for(int i=1;i<N+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                if(A[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j-A[i-1]]+dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[N][sum];

    }



}
