public class SubTreeOfANotherTree {
    public static void main(String[] args) {
     //https://leetcode.com/problems/subtree-of-another-tree/


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
        //Time Complexity: O(M*N), Traversing on subtree S of size M for every N node of Tree T.
        //Auxiliary space: O(n)
        class Solution {
            public boolean isSubtree(TreeNode root, TreeNode subRoot) {

                if(root==null)
                {
                    return false;
                }
                if(subRoot==null)
                {
                    return true;
                }
                if(check(root,subRoot))
                {
                    return true;
                }
                if(isSubtree(root.left,subRoot))
                {
                    return true;
                }
                return isSubtree(root.right,subRoot) ;

            }
            public boolean check(TreeNode root1,TreeNode root2)
            {

                if(root1==null && root2==null)
                {
                    return true;
                }
                if(root1==null || root2==null)
                {
                    return false;
                }
                if(root1.val!=root2.val)
                {
                    return false;
                }

                else if(root1.val==root2.val)
                {

                    if(check(root1.left,root2.left) && check(root1.right,root2.right))
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }

                }
                return false;
            }


        }
    }
}
