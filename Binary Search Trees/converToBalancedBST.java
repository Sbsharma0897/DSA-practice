public class converToBalancedBST {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/normal-bst-to-balanced-bst/1
     }

    Node buildBalancedTree(Node root)
    {
        ArrayList<Integer> array=new ArrayList<>();
        helper(root,array);
        int size=array.size();
        int i=0;
        int j=size-1;
        Node newroot=null;
        newroot=getMid(array,i,j,newroot);

        return newroot;
    }
    public static void helper(Node root,ArrayList<Integer> array)
    {
        if(root==null)
        {
            return ;
        }
        helper(root.left,array);
        array.add(root.data);
        helper(root.right,array);

    }
    public static Node getMid(ArrayList<Integer> array,int i,int j,Node root)
    {
        if(i>j)
        {
            return root;
        }
        int mid=(i+j)/2;
        root=insertNode(root,array.get(mid));
        getMid(array,i,mid-1,root);
        getMid(array,mid+1,j,root);
        return root;


    }
    public static Node insertNode(Node root,int data)
    {
        if(root==null)
        {
            return new Node(data);
        }
        if(root.data<data)
        {
            root.right=insertNode(root.right,data);
            return root;
        }
        if(root.data>data)
        {
            root.left=insertNode(root.left,data);
            return root;
        }

        return null;
    }

}
