import java.util.*;

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
        System.out.print(root.data+" ");

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
    static public Node delete(Node root,int val)
    {
        if(root.data<val)
        {
             root.right=delete(root.right,val);
             return root;
        }
        if(root.data>val)
        {
            root.left=delete(root.left,val);
            return root;
        }
        if(root.data==val)
        {
            if(root.left==null && root.right==null)
            {
                return null;
            }
            if(root.left==null)
            {
                return root.right;
            }
            if(root.right==null)
            {
                return root.left;
            }
            if(root.left!=null && root.right!=null)
            {
                Node inorderSucc=Inorder(root.right);
                root.data=inorderSucc.data;
                root.right= delete(root.right,inorderSucc.data);
                return root;
            }
        }
        return root;
    }
    static public Node Inorder(Node root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }
    public static void range(Node root,ArrayList<Integer> ans,int x1,int x2)
    {
        if(root==null)
        {
            return;
        }

         if(root.data>x1)
        {
            range(root.left,ans,x1,x2);
        }
        if(root.data>=x1 && root.data<=x2)
        {
            ans.add(root.data);
        }
        if(root.data<x2)
        {
            range(root.right,ans,x1,x2);
        }

    } 
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7,10,15,6,8,11,12,13};
        Node root=null;
        for (int i = 0; i < values.length; i++) {
            root=insert(root,values[i]);
        }
        print(root);
        System.out.println();
//        delete(root,7);
//        delete(root,11);
        print(root);
        ArrayList<Integer> ans=new ArrayList<>();
        int x1=6;
        int x2=8;
        range(root,ans,x1,x2);
        System.out.println(ans);
    }
}
