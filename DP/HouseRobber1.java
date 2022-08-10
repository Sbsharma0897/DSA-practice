public class HouseRobber1 {
    public static void main(String[] args) {
     //https://leetcode.com/problems/house-robber/

    }
    public int rob(int[] nums) {

        int n=nums.length;
        int dp[] =new int[n+1];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp,n);
    }
    static int helper(int[] nums,int index,int[] dp,int n)
    {
        if(index>=n)
        {
            return 0;
        }
        if(dp[index]!=-1)
        {

            return dp[index];
        }

        int take=helper(nums,index+2,dp,n)+nums[index];
        int notTake=helper(nums,index+1,dp,n);

        return dp[index]=Math.max(take,notTake);


    }
}
