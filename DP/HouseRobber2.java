public class HouseRobber2 {
    public static void main(String[] args) {
     //https://leetcode.com/problems/house-robber-ii/
    }
    public int rob(int[] nums) {

        int n=nums.length;
        int dp1[] =new int[n+1];
        Arrays.fill(dp1,-1);
        if(n==1)
        {
            return nums[0];
        }
        int dp2[] =new int[n+1];
        Arrays.fill(dp2,-1);
        if(n==1)
        {
            return nums[0];
        }
        return Math.max(helper(nums,0,dp1,n-2),helper(nums,1,dp2,n-1));
    }
    static int helper(int[] nums,int index,int[] dp,int n)
    {
        if(index>n)
        {
            return 0;
        }
        if(dp[index]!=-1)
        {

            return dp[index];
        }

        int take=helper(nums,index+2,dp,n)+nums[index];
        int notTake=helper(nums,index+1,dp,n);

        //System.out.println(take+" "+notTake+" "+index);

        return dp[index]=Math.max(take,notTake);


    }
}
