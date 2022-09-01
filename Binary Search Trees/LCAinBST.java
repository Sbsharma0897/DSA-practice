public class LCAinBST {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-bst/1
    }
    Node LCA(Node root, int n1, int n2)
    {
        //Time Complexity: O(h).
        //The time Complexity of the above solution is O(h), where h is the height of the tree.
        //Space Complexity: O(h).
        //If recursive stack space is ignored, the space complexity of the above solution is constant.
        if(root==null)
        {
            return null;
        }
        if(n1<root.data && n2<root.data)
        {
            return LCA(root.left,n1,n2);
        }
        else if(n1>root.data && n2>root.data)
        {
            return LCA(root.right,n1,n2);
        }
        else
        {
            return root;
        }
    }






    Node LCA(Node root, int n1, int n2)
    {
        //Time Complexity: O(h).
        //The Time Complexity of the above solution is O(h), where h is the height of the tree.
        //Space Complexity: O(1).
        //The space complexity of the above solution is constant.
        while(root!=null)
        {

            if(n1<root.data && n2<root.data)
            {
                root=root.left;
            }
            else if(n1>root.data && n2>root.data)
            {
                root=root.right;
            }
            else
            {
                break;
            }
        }
        return root;

    }
}
