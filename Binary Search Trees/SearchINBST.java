public class SearchINBST {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/search-a-node-in-bst/1
    }
    boolean search(Node root, int x) {
        //TC-(H)
        //SC-(H)-for function calls
        if(root==null)
        {
            return false;
        }
        if(root.data==x)
        {
            return true;
        }
        if(root.data<x)
        {
            return search(root.right,x);
        }
        if(root.data>x)
        {
            return search(root.left,x);
        }
        return false;
    }





    boolean search(Node root, int x) {
        //TC-(H)
        //SC-(1)
        while(root!=null)
        {
            if(root.data==x)
            {
                return true;
            }
            else if(root.data<x)
            {
                root=root.right;
            }
            else if(root.data>x)
            {
                root=root.left;
            }

        }
        return false;
    }
}
