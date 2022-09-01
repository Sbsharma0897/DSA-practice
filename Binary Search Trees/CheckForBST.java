public class CheckForBST {
    public static void main(String[] args) {
     //https://practice.geeksforgeeks.org/problems/check-for-bst/1
    }
    boolean isBST(Node root)
    {
        //Time Complexity: O(n^2)
        //
        //As we visit every node just once and our helper method also takes O(n) time, so overall time complexity becomes O(n) * O(n) = O(n^2)
        //
        //Auxiliary Space: O(h)
        //
        //Here h is the height of the tree and the extra space is used due to function call stack.
        if(root==null)
        {
            return true;
        }
        boolean left=isBST(root.left);
        boolean right=isBST(root.right);

        if(!left || !right)
        {
            return false;
        }
        Node maxvalue=MaxValue(root.left);
        Node minvalue=MinValue(root.right);

        if(root.left!=null &&  maxvalue!=null)
        {
            if(root.data<maxvalue.data)
            {
                return false;
            }

        }
        if(root.right!=null  && minvalue!=null)
        {
            if(root.data>minvalue.data)
            {
                return false;
            }

        }

        return true;


    }
    public Node MinValue(Node root)
    {
        if(root==null)
        {
            return root;
        }
        Node temp=root;
        while(temp.left!=null)
        {
            temp=temp.left;
        }
        return temp;
    }
    public Node MaxValue(Node root)
    {
        if(root==null)
        {
            return root;
        }
        Node temp=root;
        while(temp.right!=null)
        {
            temp=temp.right;
        }
        return temp;
    }







    Node pre=null;

    boolean isBST(Node root)
    {
        //Time Complexity: O(n)
        //
        //As we visit every node just once
        //
        //Auxiliary Space: O(h)
        //
        //Here h is the height of the tree and the extra space is used due to function call stack.
        if(root==null)
        {
            return true;
        }
        boolean left=isBST(root.left);
        if(!left)
        {
            return false;
        }
        if(pre!=null)
        {
            if(pre.data>root.data)
            {
                return false;
            }
        }
        pre=root;
        boolean right=isBST(root.right);
        if(!right)
        {
            return false;
        }

        return true;

    }

}
