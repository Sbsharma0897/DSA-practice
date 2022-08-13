public class BOUDARYTRAVEL {
    public static void main(String[] args) {
  //https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1
    }
    ArrayList <Integer> boundary(Node root)
    {

        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        ans.add(root.data);
        leftside(root.left,ans);
        //System.out.println(ans);
        leaf(root.left,ans);
        leaf(root.right,ans);
        //System.out.println(ans);

        ArrayList<Integer> stack=new ArrayList<>();
        //here instead of using stack we store valeus in ans array only but storing must be done
        //after the function calls, means when functions are retrunig back that time it will be reveresed
        rightside(root.right,stack);

        int stacksize=stack.size();
        for(int i=stacksize-1;i>=0;i--)
        {
            ans.add(stack.get(i));
        }

        return ans;

    }
    void leftside(Node root,ArrayList<Integer> ans)
    {
        if(root==null )
        {
            return ;
        }
        if(root.left==null && root.right==null)
        {
            return;
        }

        ans.add(root.data);
        if(root.left==null)
        {
            leftside(root.right,ans);
        }
        else
        {
            leftside(root.left,ans);
        }


    }

    public void rightside(Node root,ArrayList<Integer> ans)
    {

        if(root==null )
        {
            return ;
        }
        if(root.left==null && root.right==null)
        {
            return;
        }

        ans.add(root.data);


        if(root.right==null)
        {
            rightside(root.left,ans);
        }
        else
        {
            rightside(root.right,ans);
        }

    }
    public void leaf(Node root,ArrayList<Integer> ans)
    {
        if(root==null )
        {
            return ;
        }
        if(root.left==null && root.right==null)
        {
            ans.add(root.data);
            return;
        }

        leaf(root.left,ans);
        leaf(root.right,ans);

    }
