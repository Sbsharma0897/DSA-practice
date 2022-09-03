public class LeftVIew {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1
    }
    static class Pair
    {
        Node node;
        int index;
        Pair(int index,Node root)
        {
            this.index=index;
            this.node=root;
        }
    }
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        //TC-O(NlogN)-due to treemap
        //SC-O(N)+O(N);
        ArrayList<Integer> ans=new ArrayList<>();

        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> queue=new LinkedList<>();
        if(root==null)
        {
            return ans;
        }
        queue.add(new Pair(1,root));

        while(!queue.isEmpty())
        {

            Pair dummyPair=queue.remove();
            int level=dummyPair.index;
            Node dummyNode=dummyPair.node;

            if(!map.containsKey(level))
            {
                map.put(level,dummyNode.data);
            }
            if(dummyNode.left!=null)
            {
                queue.add(new Pair(level+1,dummyNode.left));
            }
            if(dummyNode.right!=null)
            {
                queue.add(new Pair(level+1,dummyNode.right));
            }


        }
        ans.addAll(map.values());
        return ans;

    }







    ArrayList<Integer> leftView(Node root)
    {
        //Recursive
        //TC-O(N)
        //SC-O(H)-this is auxilarry space of stack. we dont take rreturn data strcutre into consdieation;
        ArrayList<Integer> ans=new ArrayList<>();
        solve(root,0,ans);
        return ans;
    }
    void solve(Node root,int level, ArrayList<Integer> ans)
    {
        if(root==null)
        {
            return ;
        }
        if(ans.size()==level)
        {
            ans.add(root.data);
        }
        solve(root.left,level+1,ans);
        solve(root.right,level+1,ans);
    }








    public List<Integer> leftView(TreeNode root){

        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode dummy=queue.remove();


                if(dummy.left!=null)
                {
                    queue.add(dummy.left);
                }
                if(dummy.right!=null)
                {
                    queue.add(dummy.right);
                }
                if(i==0)
                {
                    ans.add(dummy.data);
                }
            }


        }
        return ans;


    }

}
