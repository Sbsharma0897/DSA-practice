public class SubsetSumII {
    public static void main(String[] args) {
        //https://leetcode.com/problems/subsets-ii/

        class Solution {
            public List<List<Integer>> subsetsWithDup(int[] nums) {
                List<List<Integer>> list=new ArrayList<>();
                List<Integer> output=new ArrayList<>();
                Arrays.sort(nums);
                solve(nums,0,output,list);
                return list;

            }
            public void solve(int[] nums,int index,List<Integer> output,List<List<Integer>> list)
            {

                list.add(new ArrayList<>(output));

                for(int i=index;i<nums.length;i++)
                {
                    if(i>index && nums[i]==nums[i-1])
                    {
                        continue;
                    }
                    output.add(nums[i]);
                    solve(nums,i+1,output,list);
                    output.remove(output.size()-1);
                }
            }
        }
    }
}
