public class LongestIncreasingSUbsequence {
    public static void main(String[] args) {
        //https://leetcode.com/problems/longest-increasing-subsequence/submissions/
    }

    class Solution {
        public int lengthOfLIS(int[] nums) {


            int pre=0;
            int n=nums.length;
            int[][] dp=new int[n][n];
            for(int[] arr:dp)
            {
                Arrays.fill(arr,-1);
            }
            return solve(nums,0,-1,dp);

        }
        public static int solve(int[] nums,int index,int pre,int[][] dp)
        {
            if(index==nums.length)
            {
                return 0;
            }
            if(dp[index][pre+1]!=-1)
            {
                return dp[index][pre+1];
            }
            int take=Integer.MIN_VALUE;
            if(pre==-1 || nums[index]>nums[pre])
            {
                take= 1+solve(nums,index+1,index,dp);
            }

            int nottake= 0+solve(nums,index+1,pre,dp);

            dp[index][pre+1]=Math.max(take,nottake);
            return  dp[index][pre+1];
        }
    }

}
