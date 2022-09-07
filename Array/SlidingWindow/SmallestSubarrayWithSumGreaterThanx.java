package SlidingWindow;

public class SmallestSubarrayWithSumGreaterThanx {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1
    }
    public static int smallestSubWithSum(int a[], int n, int x) {

        int minlength=Integer.MAX_VALUE;

        int i=0;
        int sum=0;
        for(int j=0;j<n;j++)
        {
            sum=sum+a[j];
            if(sum>x)
            {
                minlength=Math.min(minlength,(j-i+1));

                while(sum>x)
                {
                    minlength=Math.min(minlength,(j-i+1));
                    sum=sum-a[i];
                    i++;

                }
            }

        }
        return minlength;
    }
}
