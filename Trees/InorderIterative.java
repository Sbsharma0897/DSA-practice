public class InorderIterative {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/inorder-traversal-iterative/1
    }
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Node> stack=new Stack<>();

        Node curr=root;
        while(!stack.isEmpty() || curr!=null)
        {
            if(curr!=null)
            {
                stack.push(curr);
                curr=curr.left;
            }
            else
            {
                curr=stack.pop();
                ans.add(curr.data);
                curr=curr.right;
            }
        }
        return ans;

    }
}
