public class IterativePreOrder {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/preorder-traversal-iterative/1
    }
    ArrayList<Integer> preOrder(Node root)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Node> stack=new Stack<>();

        Node curr=root;
        while(!stack.isEmpty() || curr!=null)
        {
            while(curr!=null)
            {
                //System.out.println(curr.data+" "+curr.left);
                ans.add(curr.data);
                stack.push(curr);
                curr=curr.left;
            }

            //System.out.println(stack.size()+" "+curr+"dff ");
            Node popped=stack.pop();
            curr=popped.right;
        }
        return ans;

    }








    ArrayList<Integer> preOrder(Node root)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        Node curr=root;
        while(!stack.isEmpty())
        {
            curr=stack.pop();
            ans.add(curr.data);

            if(curr.right!=null)
            {
                stack.push(curr.right);

            }
            if(curr.left!=null)
            {
                stack.push(curr.left);

            }
        }
        return ans;


    }
