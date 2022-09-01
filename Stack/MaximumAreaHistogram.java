public class MaximumAreaHistogram {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1
    }
    public static long getMaxArea(long hist[], long N)
    {
        int n=(int)(N);
        long right[]=rightSmaller(hist,n);
        long left[]=leftSmaller(hist,n);
        long area[]=new long[n];
        for(int i=0;i<n;i++)
        {
            long x=hist[i]*(right[i]-left[i]-1);
            area[i]=x;
        }
        long max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,area[i]);
        }
        return max;
    }
    public static long[] rightSmaller(long[] arr, int n)
    {
        long ans[]=new long[n];
        Stack<Integer> stack=new Stack<>();

        for(int i=n-1;i>=0;i--)
        {
            if(stack.isEmpty())
            {
                ans[i]=n;
            }
            else
            {

                while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
                {
                    stack.pop();

                }
                if(stack.isEmpty())
                {
                    ans[i]=n;
                }
                else
                {
                    ans[i]=stack.peek();
                }
            }
            stack.push(i);
        }
        return ans;
    }
    public static long[] leftSmaller(long[] arr, int n)
    {
        long ans[]=new long[n];
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<n;i++)
        {
            if(stack.isEmpty())
            {
                ans[i]=-1;
            }
            else
            {
                while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
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
            stack.push(i);
        }
        return ans;
    }
}
