public class DiaOFBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {

        TreeInfo ans=solve(root);
        return ans.dia-1;

    }
    public static TreeInfo solve(TreeNode root)
    {
        if(root==null)
        {
            return new TreeInfo(0,0);
        }
        TreeInfo left=solve(root.left);
        TreeInfo right=solve(root.right);

        int maxDia=Math.max(left.dia,right.dia);

        int maxHeight=Math.max(left.height,right.height)+1;

        int currentDia=left.height+right.height+1;
        int finalDia=Math.max(maxDia,currentDia);

        return new TreeInfo(finalDia,maxHeight);

    }

    static class TreeInfo
    {
        int dia=0;
        int height=0;
        public TreeInfo(int dia,int height)
        {
            this.dia=dia;
            this.height=height;
        }
    }
}
