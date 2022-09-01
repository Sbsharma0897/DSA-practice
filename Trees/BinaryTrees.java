import java.util.*;

public class BinaryTrees {
    public static void main(String[] args) {
     int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
//        tree.printTreePre(tree.root);
        tree.printTreeLevelOrder();
//        System.out.println( tree.countNodes(tree.root));
//        System.out.println(tree.heightOfTree(root));
        System.out.println(tree.diameterONEAPPROACH(root));
        tree.diameterTWPAPPROACH(root);
        System.out.println(tree.maxdia);
        System.out.println(tree.diameter(root).dia);
    }
}

class BinaryTree
{
     Node root=null;
    static int index=-1;
    public Node buildTree(int nodes[])
    {
        index++;
        if(nodes[index]==-1)
        {
            return null;
        }
        Node newNode=new Node(nodes[index]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);

        root=newNode;
        return newNode;
    }
    public void printTreePre(Node root)
    {
       if(root==null)
       {
           return;
       }
        System.out.println(root.data);
        printTreePre(root.left);
        printTreePre(root.right);

    }
    public void printTreeLevel(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        printTreeLevel(root.left);
        printTreeLevel(root.right);

    }
    public void printTreeLevelOrder()
    {
        Queue<Node> queue=new LinkedList<>();
        if(root==null)
        {
            return;
        }
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty())
        {
            Node dummy=queue.remove();
            if(dummy==null)
            {
                System.out.println();
                if(queue.isEmpty())
                {
                    break;
                }
                else
                {
                    queue.add(null);
                }
            }
            else
            {
                if(dummy.left!=null)
                {
                    queue.add(dummy.left);
                }
                if(dummy.right!=null)
                {
                    queue.add(dummy.right);
                }
                System.out.print(dummy.data+" ");
            }

        }
    }

    public int countNodes(Node root)
    {
       if(root==null)
       {
           return 0;
       }
       return countNodes(root.left)+countNodes(root.right)+1;
    }
    public int heightOfTree(Node root)
    {
       if(root==null)
       {
           return 0;
       }
       int max=Math.max(heightOfTree(root.left),heightOfTree(root.right));
       return max+1;

    }
    public int diameterONEAPPROACH(Node root)
    {
        //TC-O(n^2)
        if(root==null)
        {
            return 0;
        }
        int d1=diameterONEAPPROACH(root.left);
        int d2=diameterONEAPPROACH(root.right);
        int d3=heightOfTree(root.left)+heightOfTree(root.right)+1;
        return Math.max(d3,Math.max(d1,d2));
    }
    int maxdia=0;

    public int diameterTWPAPPROACH(Node root)
    {
        //TC-O(n)
       int left=heightOfTree(root.left);
       int right=heightOfTree(root.right);

       int dia=left+right+1;
       if(dia>maxdia)
       {
           maxdia=dia;
       }
       return Math.max(left,right);

    }
    class TreeInfo
    {
        int ht;
        int dia;
        TreeInfo(int ht,int dia)
        {
            this.ht=ht;
            this.dia=dia;
        }
    }

    public TreeInfo diameter(Node root) {
        if(root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo leftTI = diameter(root.left);
        TreeInfo rightTI = diameter(root.right);

        int myHeight = Math.max(leftTI.ht, rightTI.ht) + 1;

        int diam1 = leftTI.ht + rightTI.ht + 1;
        int diam2 = leftTI.dia;
        int diam3 = rightTI.dia;

        int myDiam = Math.max(diam1, Math.max(diam2, diam3));

        return new TreeInfo(myHeight, myDiam);
    }

}
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
