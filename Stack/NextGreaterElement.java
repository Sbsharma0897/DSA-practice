public class NextGreaterElement {
    public static void main(String[] args) {
  //https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1
    }
    public static long[] nextLargerElement(long[] arr, int n)
    {
        long ans[]=new long[n];
        Stack<Long> stack=new Stack<>();

        for(int i=n-1;i>=0;i--)
        {
            if(stack.isEmpty())
            {
                ans[i]=-1;
            }
            else
            {
                while(!stack.isEmpty() && stack.peek()<=arr[i])
                {
                    stack.pop();

                }
                if(stack.isEmpty())
                {
                    ans[i]=-1;
                }
                else
                {
                    ans[i]=stack.peek();
                }
            }
            stack.push(arr[i]);
        }
        return ans;
    }
}
