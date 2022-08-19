public class BST {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int val)
        {
            this.data=val;
        }
    }
    public static Node insert(Node root,int val)
    {
        if(root==null)
        {
            root=new Node(val);
            return root;
        }
        if(root.data<val)
        {
             root.right=insert(root.right,val);
        }else
        {
            root.left=insert(root.left,val);
        }
        return root;
    }
    static public void print(Node root)
    {
        if(root==null)
        {
            return;
        }
        print( root.left);
        System.out.println(root.data);
        print( root.right);
    }
    static public boolean search(Node root,int val)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==val)
        {
            return true;
        }
        if(root.data>val)
        {
            return search(root.left,val);
        }
        if(root.data<val)
        {
            return search(root.right,val);
        }
        return false;
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for (int i = 0; i < values.length; i++) {
            root=insert(root,values[i]);
        }
        print(root);
        System.out.println(search(root,10));

    }
}
