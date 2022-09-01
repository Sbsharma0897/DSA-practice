public class InordePredescssorAndSuccessor {
    public static void main(String[] args) {
   //
    }

    public static void findPreSuc(Node root, Res p, Res s, int key)
    {

        Node curr=root;
        while(curr!=null)
        {
            if(curr.data<key)
            {
                p.pre=curr;
                curr=curr.right;
            }
            else if(curr.data>key)
            {
                s.succ=curr;
                curr=curr.left;
            }
            else
            {
                Node pree=Maxvalue(curr.left);
                Node post=Minvalue(curr.right);

                if(curr.left!=null)
                {
                    p.pre=pree;
                }
                if(curr.right!=null)
                {
                    s.succ=post;
                }



                break;
            }
        }
    }
    public static Node Minvalue(Node root)
    {
        if(root==null)
        {
            return null;
        }
        Node temp=root;
        while(temp.left!=null)
        {
            temp=temp.left;
        }
        return temp;
    }
    public static Node Maxvalue(Node root)
    {
        if(root==null)
        {
            return null;
        }
        Node temp=root;
        while(temp.right!=null)
        {
            temp=temp.right;
        }
        return temp;
    }
}
