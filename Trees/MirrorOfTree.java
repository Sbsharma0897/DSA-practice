public class MirrorOfTree {
    public static void main(String[] args) {

    }
    public TreeNode mirrorTree(TreeNode root){

        helper(root);
        return root;
    }
    public void helper(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        TreeNode left=root.left;
        TreeNode right=root.right;

        root.left=right;
        root.right=left;

        helper(root.left);
        helper(root.right);

    }
}
