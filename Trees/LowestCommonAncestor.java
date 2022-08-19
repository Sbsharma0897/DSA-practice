public class LowestCommonAncestor {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-binary-tree/1
    }
    Node lca(Node root, int n1,int n2)
    {
        //TC-O(n^2)
        ArrayList<Node> forN1=new ArrayList<>();

        ArrayList<Node> forN2=new ArrayList<>();

        helper(root,n1,forN1);
        helper(root,n2,forN2);

        int size1=forN1.size();
        int size2=forN2.size();

        for(int i=size1-1;i>=0;i--)
        {
            for(int j=size2-1;j>=0;j--)
            {
                if(forN2.get(j).data==forN1.get(i).data)
                {
                    return forN2.get(j);
                }
            }
        }
        return root;



    }
    public 	boolean helper(Node root,int n,ArrayList<Node> array)
    {
        if(root==null)
        {
            return false;
        }
        array.add(root);
        if(root.data==n)
        {
            return true;

        }
        if(helper(root.left,n,array))
        {
            return true;
        }
        if(helper(root.right,n,array))
        {
            return true;
        }

        array.remove(array.size()-1);

        return false;


    }






    Node lca(Node root, int n1,int n2)
    {
        //Recursion
        if(root==null)
        {
            return root;
        }
        if(root.data==n1 || root.data==n2)
        {
            return root;
        }
        Node left= lca(root.left,n1,n2);
        Node right= lca(root.right,n1,n2);

        if(left!=null && right!=null)
        {
            return root;
        }
        if(left!=null && right==null)
        {
            return left;
        }
        if(right!=null && left==null)
        {
            return right;
        }
        return null;
    }
}
}
