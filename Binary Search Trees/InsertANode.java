public class InsertANode {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/insert-a-node-in-a-bst/1
    }
    Node insert(Node root, int key) {
        if(root==null)
        {
            return new Node(key);
        }
        Node curr=root;
        while(curr!=null)
        {
            if(curr.data<key)
            {
                if(curr.right!=null)
                {
                    curr=curr.right;
                }
                else
                {
                    curr.right=new Node(key);
                    break;
                }
            }
            else if(curr.data>key)
            {
                if(curr.left!=null)
                {
                    curr=curr.left;
                }
                else
                {
                    curr.left=new Node(key);
                    break;
                }
            }
            else
            {
                break;
            }
        }
        return root;
    }
}
