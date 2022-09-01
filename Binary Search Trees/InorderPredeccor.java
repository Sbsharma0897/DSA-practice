public class InorderPredeccor {
    public static void main(String[] args) {
//https://practice.geeksforgeeks.org/problems/predecessor-and-successor/1
    }
    TreeNode pre=new TreeNode(-1);
    public int inorderPredecessor(TreeNode root, int x)
    {
        if(root==null)
        {
            return -1;
        }

        int left=inorderPredecessor(root.left, x);
        if(left!=-1)
        {
            return left;
        }
        if(root.val==x)
        {
            return pre.val;
        }
        pre=root;
        int right=inorderPredecessor(root.right, x);
        if(right!=-1)
        {
            return right;
        }

        return -1;

}
