public class SmallestNumberonLeft {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1
    }
    static List<Integer> leftSmaller(int n, int arr[])
    {
        List<Integer> ans=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<n;i++)
        {
            if(stack.isEmpty())
            {
                ans.add(-1);
            }
            else
            {
                while(!stack.isEmpty() && stack.peek()>=arr[i])
                {
                    stack.pop();

                }
                if(stack.isEmpty())
                {
                    ans.add(-1);
                }
                else
                {
                    ans.add(stack.peek());
                }
            }
            stack.push(arr[i]);
        }
        return ans;
    }
}
