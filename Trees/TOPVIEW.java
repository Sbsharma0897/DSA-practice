public class TOPVIEW {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1
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
    //Function to return a list of nodes visible from the top view
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> queue=new LinkedList<>();
        if(root==null)
        {
            return ans;
        }

        queue.add(new Pair(0,root));

        while(!queue.isEmpty())
        {
            Pair dummy=queue.remove();
            int index=dummy.index;
            Node node=dummy.node;
            if(node.left!=null)
            {
                queue.add(new Pair(index-1,node.left));
            }
            if(node.right!=null)
            {
                queue.add(new Pair(index+1,node.right));
            }
            if(!map.containsKey(index))
            {
                map.put(index,node.data);
            }

        }
        for(int x:map.values() )
        {
            ans.add(x);
        }
        return ans;

    }
}
