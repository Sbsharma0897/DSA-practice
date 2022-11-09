public class ConstructTreeFromInordeeAndPreorder {
    public static void main(String[] args) {
//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/submissions/
        /**
         * Definition for a binary tree node.
         * public class TreeNode {
         *     int val;
         *     TreeNode left;
         *     TreeNode right;
         *     TreeNode() {}
         *     TreeNode(int val) { this.val = val; }
         *     TreeNode(int val, TreeNode left, TreeNode right) {
         *         this.val = val;
         *         this.left = left;
         *         this.right = right;
         *     }
         * }
         */
        class Solution {
            public TreeNode buildTree(int[] preorder, int[] inorder) {

                return helper(preorder,inorder,0,preorder.length-1,0,inorder.length-1);

            }
            public static TreeNode helper(int[] preorder,int[] inorder,int prei,int prej,int ini,int inj)
            {
                if(prei>prej || ini>inj)
                {
                    return null;
                }

                TreeNode newNode=new TreeNode(preorder[prei]);
                int mid=getValue(inorder,ini,inj,preorder[prei]);
                //System.out.println(mid);

                newNode.left=helper(preorder,inorder,prei+1,prei+(mid-ini),ini,mid-1);
                newNode.right=helper(preorder,inorder,prei+(mid-ini)+1,prej,mid+1,inj);

                return newNode;

            }
            public static int getValue(int[] inorder,int i,int j,int value)
            {
                for(int k=i;k<=j;k++)
                {
                    if(inorder[k]==value)
                    {
                        return k;
                    }
                }
                return -1;
            }
        }
    }
}
