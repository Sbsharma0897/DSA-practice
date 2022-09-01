public class DeleteANode {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/delete-a-node-from-bst/1
    }
    public static Node deleteNode(Node root, int key) {
        if(root==null)
        {
            return null;
        }
        if(root.data==key)
        {
            return helper(root);
        }
        Node curr=root;
        while(curr!=null)
        {
            if(curr.data<key)
            {
                if(curr.right!=null && curr.right.data==key)
                {
                    curr.right=helper(curr.right);
                }

                else
                {
                    curr=curr.right;
                }
            }
            else if(curr.data>key)
            {
                if(curr.left!=null && curr.left.data==key)
                {
                    curr.left=helper(curr.left);
                }

                else
                {
                    curr=curr.left;
                }
            }

        }
        return root;
    }
    public static Node helper(Node curr)
    {
        if(curr.left==null)
        {
            return curr.right;
        }
        else if(curr.right==null)
        {
            return curr.left;
        }
        else
        {
            Node InorderSuccess=Inorder(curr.right);
            curr.data=InorderSuccess.data;
            curr.right=deleteNode(curr.right,InorderSuccess.data);
            return curr;
        }
    }
    static public Node Inorder(Node root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }
}
