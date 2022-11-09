public class SubarraySumequalK {
    //https://leetcode.com/problems/subarray-sum-equals-k/submissions/
    class Solution {
        public int subarraySum(int[] nums, int k) {

            HashMap<Integer,Integer> map=new HashMap<>();
            int count=0;
            int n=nums.length;
            int sum=0;

            for(int i=0;i<n;i++)
            {
                sum=sum+nums[i];
                if(sum==k)
                {
                    count++;
                }
                if(map.containsKey(sum-k))
                {
                    count=count+map.get(sum-k);
                }
                if(map.containsKey(sum))
                {
                    map.put(sum,map.get(sum)+1);
                }
                else
                {
                    map.put(sum,1);
                }
            }
            return count;
        }
    }
}
