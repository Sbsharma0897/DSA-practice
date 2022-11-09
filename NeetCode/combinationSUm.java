public class combinationSUm {
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {

            List<List<Integer>> list=new ArrayList<>();
            List<Integer> ans=new ArrayList<>();

            solve(candidates,target,ans,list,0);
            return list;
        }
        public static void solve(int[] candidates,int target,List<Integer> ans,List<List<Integer>> list,int index)
        {
            if(target<0)
            {
                return;
            }
            if(target==0)
            {
                list.add(new ArrayList<>(ans));
                return;
            }
            if(index==candidates.length)
            {
                return;
            }

            ans.add(candidates[index]);
            solve(candidates,target-candidates[index],ans,list,index);
            ans.remove(ans.size()-1);
            solve(candidates,target,ans,list,index+1);

        }
    }
}
