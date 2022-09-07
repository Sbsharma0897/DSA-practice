package SlidingWindow;

public class MaximumConsetuvieOnes {
    public static void main(String[] args) {
   //https://leetcode.com/problems/max-consecutive-ones-iii/
    }
    public int longestOnes(int[] nums, int k) {
        int zerocount=0;
        int onecount=0;
        int i=0;
        int maxlength=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==0)
            {
                zerocount++;
            }
            else
            {
                onecount++;
            }

            if(zerocount<=k)
            {
                maxlength=Math.max(maxlength,(zerocount+onecount));
            }
            else
            {
                while(zerocount>k)
                {
                    int x=nums[i];
                    if(x==0)
                    {
                        zerocount--;
                    }
                    else
                    {
                        onecount--;
                    }
                    i++;
                }
            }

        }
        return maxlength;
    }
}
