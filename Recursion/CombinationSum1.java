public class CombinationSum1 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/combination-sum/submissions/
        class Solution {
            public List<List<Integer>> combinationSum(int[] candidates, int target) {

                ArrayList<Integer> output=new ArrayList<>();
                // List<List<Integer>> list=new ArrayList<>();
                int index=0;
                int sum=0;
                return solve(candidates,target,index,sum,output);

            }
            public static List<List<Integer>> solve(int[] candidates,int target,int index,int sum,ArrayList<Integer> output)
            {
                if(sum>target)
                {
                    List<List<Integer>> list=new ArrayList<>();
                    return list;
                }
                if(index>=candidates.length)
                {
                    List<List<Integer>> list=new ArrayList<>();
                    if(sum==target)
                    {

                        list.add(new ArrayList<>(output));

                    }
                    return list;
                }
                output.add(candidates[index]);
                List<List<Integer>> list=solve(candidates,target,index,sum+candidates[index],output);
                output.remove(output.size()-1);

                List<List<Integer>> dummy=solve(candidates,target,index+1,sum,output);
                list.addAll(dummy);
                return list;

            }
        }
    }
}
