public class MinCostOfRopes {
    public static void main(String[] args) {
  //https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1
    }
    long minCost(long arr[], int n)
    {
        long ans=0;
        PriorityQueue<Long> queue=new PriorityQueue<>();

        for(int i=0;i<n;i++)
        {
            queue.add(arr[i]);
        }
        while(queue.size()>1)
        {
            long a=queue.peek();
            queue.poll();
            long b=queue.peek();
            queue.poll();

            ans=ans+a+b;
            if(queue.isEmpty())
            {

                break;
            }
            queue.add(a+b);

        }
        return ans;
    }
}
