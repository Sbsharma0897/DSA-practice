public class MinimumJumpsToReachEnd {
    public static void main(String[] args) {
        //https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
    }
    static int minJumps(int[] arr){

        int n=arr.length;
        int index=0;
        int x= helper(arr,index,n);
        if(x==Integer.MAX_VALUE)
        {
            return -1;
        }
        else
        {
            return x;
        }
    }
    static int helper(int[] arr,int index,int n)
    {
        if(index==n-1)
        {
            return 0;
        }
        if(index>=n)
        {
            return Integer.MAX_VALUE;
        }
        if(arr[index]==0)
        {
            return Integer.MAX_VALUE;
        }

        int value=arr[index];
        int min=Integer.MAX_VALUE;
        for(int i=index+1;i<=index+value;i++)
        {
            int returned=helper(arr,i,n);
            if(returned!=Integer.MAX_VALUE)
            {
                min=Math.min(min,returned);
            }

        }
        return min+1;
    }
}
