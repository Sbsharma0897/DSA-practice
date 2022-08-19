public class PathSum {
    public static void main(String[] args) {
  //https://oj.masaischool.com/contest/4964/problem/13
    }
    public boolean pathSum(TreeNode root,int k){

        int amount=0;
        return helper(root,k,amount);
    }
    public boolean helper(TreeNode root,int k,int amount)
    {
        if(root==null)
        {
            if(amount==k)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        amount +=root.data;
        boolean left=helper(root.left,k,amount);
        boolean right=helper(root.right,k,amount);

        if(left || right)
        {
            return true;
        }
        return false;
    }
}
