public class SquaresOfSortedArray {
    public static void main(String[] args) {
        //https://leetcode.com/problems/squares-of-a-sorted-array/
        class Solution {
            public int[] sortedSquares(int[] nums) {

                int n=nums.length;
                for(int i=0;i<n;i++)
                {
                    nums[i]=nums[i]*nums[i];
                }
                int[] ans=new int[n];
                int k=n-1;
                int i=0;
                int j=n-1;
                while(i<j)
                {
                    if(nums[i]==nums[j])
                    {
                        ans[k]=nums[i];
                        i++;
                        k--;
                    }
                    else if(nums[i]>nums[j])
                    {
                        ans[k]=nums[i];
                        i++;
                        k--;
                    }
                    else
                    {
                        ans[k]=nums[j];
                        j--;
                        k--;
                    }
                }
                return ans;
            }
        }

    }
}
