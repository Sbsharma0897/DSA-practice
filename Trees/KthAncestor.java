public class KthAncestor {
    public static void main(String[] args) {
     //https://practice.geeksforgeeks.org/problems/kth-ancestor-in-a-tree/1
    }
    public int kthAncestor(Node root, int k, int node)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        helper(root,k,node,ans);

        int x=0;
        for(int i=ans.size()-1;i>=0;i--)
        {
            if(x==k)
            {
                return ans.get(i);
            }
            x++;

        }
        return -1;

    }
    public boolean helper(Node root, int k, int node, ArrayList<Integer> ans)
    {
        if(root==null)
        {
            return false;
        }
        ans.add(root.data);
        if(root.data==node)
        {
            return true;
        }


        boolean left=helper(root.left,k,node,ans);
        boolean right=helper(root.right,k,node,ans);

        if(left || right)
        {
            return true;
        }
        ans.remove(ans.size()-1);

        return false;

    }









    static int kk;
    public int kthAncestor(Node root, int k, int node)
    {
        //TC-O(N)
        kk=k;

        Node ans= helper(root,k,node);
        if(ans==null || ans.data==node)
        {
            return -1;
        }
        else
        {
            return ans.data;
        }

    }
    public Node helper(Node root, int k, int node)
    {
        if(root==null)
        {
            return null;
        }
        if(root.data==node)
        {

            return root;
        }


        Node left= helper(root.left,k,node);
        Node right= helper(root.right,k,node);


        if(left!=null && right==null)
        {
            kk--;
            if(kk==0)
            {
                kk=Integer.MAX_VALUE;
                return root;
            }
            else
            {

                return left;
            }
        }
        if(right!=null && left==null)
        {
            kk--;
            if(kk==0)
            {
                kk=Integer.MAX_VALUE;
                return root;
            }
            else
            {

                return right;
            }
        }
        return null;



    }








}
