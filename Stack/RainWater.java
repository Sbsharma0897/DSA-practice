public class RainWater {

    public static void main(String[] args) {
//https://leetcode.com/problems/trapping-rain-water/submissions/

        class Solution {
            public int trap(int[] height) {

                int n=height.length;

                int[] leftArray=new int[n];
                leftArray[0]=height[0];

                for(int i=1;i<n;i++)
                {
                    leftArray[i]=Math.max(leftArray[i-1],height[i-1]);

                }

                int[] rightArray=new int[n];
                rightArray[0]=height[0];

                for(int i=n-2;i>=0;i--)
                {
                    rightArray[i]=Math.max(rightArray[i+1],height[i+1]);

                }



                int total=0;
                for(int i=0;i<n;i++)
                {
                    int val=Math.min(leftArray[i],rightArray[i]);
                    if(val>height[i])
                    {
                        total=total+(val-height[i]);
                    }
                }
                return total;

            }
        }
    }
}
