public class GenerateParantheis {
    class Solution {
        public List<String> generateParenthesis(int n) {

            List<String> list=new ArrayList<>();
            String ans="";
            int left=n;
            int right=n;

            helper(left,right,list,ans);
            return list;
        }
        public static void helper(int left,int right,List<String> list,String ans)
        {
            if(left==0 && right==0)
            {
                list.add(ans);
                return;
            }
            if(left<0 || right<0)
            {
                return;
            }

            if(left==right)
            {
                helper(left-1,right,list,ans+'(');
            }
            else if(left<right)
            {
                helper(left-1,right,list,ans+'(');
                helper(left,right-1,list,ans+')');
            }
        }
    }
}
