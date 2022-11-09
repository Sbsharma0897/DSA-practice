public class SlidingWindowMaximum {
    public static void main(String[] args) {
        //https://leetcode.com/problems/sliding-window-maximum/
    }
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {

            int j=0;

            Deque<Integer> queue = new ArrayDeque<>();
            int n=nums.length;
            int ans[]=new int[n-k+1];
            for(int i=0;i<n;i++)
            {
                if(queue.size()==0)
                {
                    queue.add(nums[i]);
                }
                else
                {
                    while(queue.size()>0 && queue.peekLast()<nums[i])
                    {
                        queue.removeLast();

                    }
                    queue.addLast(nums[i]);
                }

                if(i-j+1>=k)
                {
                    ans[j]=queue.peekFirst();
                    if(nums[j]==queue.peekFirst())
                    {
                        queue.pollFirst();
                    }
                    j++;
                }

            }
            return ans;

        }
    }
}
