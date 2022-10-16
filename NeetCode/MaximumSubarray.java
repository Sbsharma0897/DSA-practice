public class MaximumSubarray {
    public static void main(String[] args) {
        //https://leetcode.com/problems/maximum-subarray/
        public int maxSubArray(int[] nums) {

            int maxsum=Integer.MIN_VALUE;
            int sum=0;
            for(int i=0;i<nums.length;i++)
            {
                sum=sum+nums[i];
                maxsum=Math.max(maxsum,sum);
                if(sum<0)
                {
                    sum=0;
                }
            }
            return maxsum;

        }
    }
}
