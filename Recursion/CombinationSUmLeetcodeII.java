public class CombinationSUmLeetcodeII {
    public static void main(String[] args) {

        //https://leetcode.com/problems/combination-sum-ii/submissions/
    }

    //This is correct but TLE due to hashset
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> output=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();
        Arrays.sort(candidates);
        int sum=0;
        solve(candidates,target,0,sum,output,set);
        List<List<Integer>> ans=new ArrayList<>(set);
        Collections.sort(ans, (o1, o2) -> {
            int n = Math.min(o1.size(), o2.size());
            for (int i = 0; i < n; i++) {
                if (o1.get(i) == o2.get(i)){
                    continue;
                }else{
                    return o1.get(i) - o2.get(i);
                }
            }
            return 1;
        });
        return ans;

    }
    public void solve(int[] candidates, int target,int index,int sum,List<Integer> output, HashSet<List<Integer>> set)
    {
        if(index>=candidates.length)
        {
            if(sum==target)
            {
                set.add(new ArrayList<>(output));

            }
            return;
        }

        output.add(candidates[index]);
        solve(candidates,target,index+1,sum+candidates[index],output,set);
        output.remove(output.size()-1);
        solve(candidates,target,index+1,sum,output,set);

    }








    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<Integer> output=new ArrayList<>();
            List<List<Integer>> list=new ArrayList<>();
            Arrays.sort(candidates);
            int sum=0;
            solve(candidates,target,0,sum,output,list);


            return list;

        }
        public void solve(int[] candidates, int target,int index,int sum,List<Integer> output, List<List<Integer>> list)
        {
            //System.out.println(index+"  "+candidates.length);

            if(sum==target)
            {
                list.add(new ArrayList<>(output));
                return;
            }


            for(int i=index;i<candidates.length;i++)
            {
                if(i>index && candidates[i]==candidates[i-1])
                {
                    continue;
                }
                if(candidates[i]>target-sum)
                {
                    break;
                }

                output.add(candidates[i]);

                solve(candidates,target,i+1,(sum+candidates[i]),output,list);
                output.remove(output.size()-1);


            }

        }
    }
}
