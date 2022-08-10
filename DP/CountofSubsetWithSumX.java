public class CountofSubsetWithSumX {
    public static void main(String[] args) {

        int[] array={1,2,3,3};
        int n=4;
        int sum=6 ;
        int count=0;

        int[][] dp=new int[n+1][sum+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                dp[i][j]=-1;
            }
        }
        System.out.println(subSetFindDPBottomUp(array,n,sum));
       // System.out.println(subSetFindDP(array,n,sum,dp));
       // System.out.println(subSetFind(array,n,sum));
    }
    static int subSetFind(int[] array,int n,int target)
    {
        //Recursion.TC-2^n;
        if(target==0)
        {
            return 1;
        }
        if(n==0)
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

        if(array[n-1]<=target)
        {
            int a =subSetFind(array,n-1,target-array[n-1]);
            int b =subSetFind(array,n-1,target);
            return a+b;
        }
        return subSetFind(array,n-1,target);

    }
    static int subSetFindDP(int[] array,int n,int target,int[][] dp)
    {
        if(target==0)
        {
            return 1;
        }
        if(n==0)
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
        if(dp[n][target]!=-1)
        {
            return dp[n][target];
        }

        if(array[n-1]<=target)
        {
            int a =subSetFind(array,n-1,target-array[n-1]);
            int b =subSetFind(array,n-1,target);
             return dp[n][target]=a+b;
        }
        return dp[n][target]= subSetFind(array,n-1,target);
    }
    static int subSetFindDPBottomUp(int[] arr,int N,int sum)
    {
        int dp[][]=new int[N+1][sum+1];

        for(int j=0;j<sum+1;j++)
        {
            dp[0][j]=0;
        }
        for(int i=0;i<N+1;i++)
        {
            dp[i][0]=1;
        }

        for(int i=1;i<N+1;i++)
        {
            for(int j=1;j<sum+1;j++)
            {
                if(arr[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j-arr[i-1]] + dp[i-1][j];
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
