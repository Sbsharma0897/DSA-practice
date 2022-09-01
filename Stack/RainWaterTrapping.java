public class RainWaterTrapping {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1
    }
    static long trappingWater(int arr[], int n)
    {
        int area[]=new int[n];
        int right[]=rightBig(arr,n);
        int left[]=leftBig(arr,n);
        for(int i=0;i<n;i++)
        {
            int upperbound=Math.min(right[i],left[i]);
            int diff=upperbound-arr[i];
            area[i]=diff;
        }
        long ans=0;
        for(int i=0;i<n;i++)
        {
            ans +=area[i];

        }
        return ans;

    }
    public static int[] rightBig(int[] arr, int n)
    {
        int ans[]=new int[n];
        Stack<Integer> stack=new Stack<>();
        int max=0;
        for(int i=n-1;i>=0;i--)
        {
            max=Math.max(arr[i],max);
            ans[i]=max;
        }
        return ans;
    }public static int[] leftBig(int[] arr, int n)
    {
        int ans[]=new int[n];
        Stack<Integer> stack=new Stack<>();
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(arr[i],max);
            ans[i]=max;
        }
        return ans;
    }
}
