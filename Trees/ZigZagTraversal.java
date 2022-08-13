public class ZigZagTraversal {
    public static void main(String[] args) {
//https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1
    }
    ArrayList<Integer> zigZagTraversal(Node root)
    {
        ArrayList<Integer> ans=new ArrayList<>();

        Queue<Node> queue=new LinkedList<>();

        boolean flag=true;
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            int arr[]=new int[size];
            for(int i=0;i<size;i++)
            {
                Node dummy=queue.remove();

                int index;
                if(flag==true)
                {
                    index=i;
                }
                else
                {
                    index=size-1-i;
                }
                arr[index]=dummy.data;

                if(dummy.left!=null)
                {
                    queue.add(dummy.left);
                }
                if(dummy.right!=null)
                {
                    queue.add(dummy.right);
                }


            }
            flag=!flag;
            for(int i=0;i<size;i++)
            {
                ans.add(arr[i]);
            }
        }

        return ans;
    }
}
