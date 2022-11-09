public class JumpGame {
    //https://leetcode.com/problems/jump-game/submissions/
    class Solution {

        //dp
        public boolean canJump(int[] nums) {


            int n=nums.length;
            int[] dp=new int[n];
            Arrays.fill(dp,-1);

            return helper(nums,0,dp);

        }
        public static boolean helper(int[] nums,int index,int[] dp)
        {
            if(index==nums.length-1)
            {
                return true;
            }
            if(index>=nums.length || nums[index]==0)
            {
                return false;
            }
            if(dp[index]!=-1)
            {
                if(dp[index]==1)
                {return true;}
                else
                {
                    return false;
                }

            }
            int value=nums[index];
            for(int i=index+1;i<=index+value;i++)
            {
                if(helper(nums,i,dp))
                {

                    dp[index]=1;
                    return true;
                }

            }
            dp[index]=0;
            return false;

        }
    }


    //GREEDY O(N)
    class Solution {
        public boolean canJump(int[] nums) {

            int n=nums.length;
            int i=n-1-1;
            int j=n-1;

            while(i>=0)
            {
                if(i+nums[i]>=j)
                {
                    j=i;
                    i=i-1;
                }
                else
                {
                    i--;
                }
            }
            if(j==0)
            {
                return true;
            }
            return false;
        }
    }
}
