public class BottomView {
    public static void main(String[] args) {
//https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1
    }
    public ArrayList <Integer> bottomView(Node root)
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

            map.put(index,node.data);


        }
        for(int x:map.values() )
        {
            ans.add(x);
        }
        return ans;
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

}
