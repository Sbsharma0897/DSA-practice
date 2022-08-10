public class MinCostClimibg {
    public static void main(String[] args) {
     //https://practice.geeksforgeeks.org/problems/min-cost-climbing-stairs/1
        //Given an array of integers cost[] of length N, where cost[i] is the cost of the ith step on a staircase. Once the cost is paid, you can either climb one or two steps.
        //You can either start from the step with index 0, or the step with index 1.
        //Return the minimum cost to reach the top of the floor.
    }
    static int minCostClimbingStairs(int[] cost , int N) {

        //Recursion

        return Math.min(helper(cost,N-1),helper(cost,N-2));


    }
    static int helper(int[] cost,int N)
    {
        if(N==0)
        {
            return cost[N];
        }
        if(N==1)
        {
            return cost[N];
        }


        return Math.min(helper(cost,N-1),helper(cost,N-2))+cost[N];

    }




    static int minCostClimbingStairs(int[] cost , int N) {
//MEMOIZATION
        int dp[]=new int[N+1];
        Arrays.fill(dp,-1);
        return Math.min(helper(cost,N-1,dp),helper(cost,N-2,dp));


    }
    static int helper(int[] cost,int N,int[] dp)
    {
        if(N==0)
        {
            return cost[N];
        }
        if(N==1)
        {
            return cost[N];
        }
        if(dp[N]!=-1)
        {
            return dp[N];
        }


        return dp[N]=(Math.min(helper(cost,N-1,dp),helper(cost,N-2,dp))+cost[N]);

    }





    static int minCostClimbingStairs(int[] cost , int N) {

        int dp[]=new int[N];

        dp[0]=cost[0];
        dp[1]=cost[1];

        for(int i=2;i<N;i++)
        {
            dp[i]=Math.min(dp[i-1],dp[i-2])+cost[i];
        }
        return Math.min(dp[N-1],dp[N-2]);
    }

}
