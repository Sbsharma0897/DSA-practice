public class ConnectNodeAtSamelvele {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/connect-nodes-at-same-level/1
    }
    class Solution
    {
        //Function to connect nodes at same level.
        public void connect(Node root)
        {
            Queue<Node> queue=new LinkedList<>();
            if(root==null)
            {
                return;
            }
            queue.add(root);

            while(!queue.isEmpty())
            {
                int n=queue.size();

                for(int i=0;i<n;i++)
                {
                    Node ret=queue.poll();
                    if(i==n-1)
                    {
                        ret.nextRight=null;
                    }
                    else
                    {
                        ret.nextRight=queue.peek();
                    }
                    if(ret.left!=null)
                    {
                        queue.add(ret.left);
                    }
                    if(ret.right!=null)
                    {
                        queue.add(ret.right);
                    }


                }
            }
        }
}
