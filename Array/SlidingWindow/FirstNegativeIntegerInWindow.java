package SlidingWindow;

public class FirstNegativeIntegerInWindow {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
    }
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        Queue<Long> queue=new LinkedList<>();
        long[] ans=new long[N-K+1];
        int i=0;
        int index=0;
        for(int j=0;j<N;j++)
        {
            if(A[j]<0)
            {
                queue.add(A[j]);
            }
            if(j-i+1>=K)
            {
                if(queue.isEmpty())
                {
                    ans[index]=0;
                    index++;
                }
                else
                {
                    ans[index]=queue.peek();
                    index++;

                }
                long first=A[i];
                if(!queue.isEmpty() && queue.peek()==first )
                {
                    queue.remove();
                }
                i++;
            }
        }
        return ans;

    }
}
