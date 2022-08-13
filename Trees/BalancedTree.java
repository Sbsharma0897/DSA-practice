public class BalancedTree {
    public static void main(String[] args) {

    //https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1
    }
    boolean isBalanced(Node root)
    {
        //TC-n^2
        if(root==null)
        {
            return true;
        }

        boolean left=isBalanced(root.left);
        boolean right=isBalanced(root.right);

        int lefthei=height(root.left);
        int righthei=height(root.right);
        boolean diff=Math.abs(lefthei-righthei)<=1;
        if(left && right && diff)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int max=Math.max(height(root.left),height(root.right));
        return max+1;

    }









    boolean isBalanced(Node root)
    {
        //O(n)
        TreeInfo ans=checkBalance(root);
        return ans.balance;
    }
    public TreeInfo checkBalance(Node root)
    {
        if(root==null)
        {
            return new TreeInfo(0,true);
        }

        TreeInfo left=checkBalance(root.left);
        TreeInfo right=checkBalance(root.right);

        int lefthei=left.height;
        int righthei=right.height;
        int max=Math.max(lefthei,righthei)+1;
        boolean diff=Math.abs(lefthei-righthei)<=1;
        if(left.balance && right.balance && diff)
        {
            return new TreeInfo(max,true);
        }
        else
        {
            return new TreeInfo(max,false);
        }
    }
    class TreeInfo
    {
        int height;
        boolean balance;

        TreeInfo(int height,boolean balance)
        {
            this.height=height;
            this.balance=balance;
        }
    }
}
