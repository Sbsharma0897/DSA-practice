public class produtArray {
    public static void main(String[] args) {
//Product array puzzle
    }
    public static long[] productExceptSelf(int nums[], int n)
    {
        long[] left=new long[n];
        long[] right=new long[n];
        long product=1;
        left[0]=1;
        for(int i=1;i<n;i++)
        {
            product *=nums[i-1];
            left[i]=product;
        }

        product=1;
        right[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            product *=nums[i+1];
            right[i]=product;
        }
        long[] ans= new long[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=left[i]*right[i];

        }
        return ans;
    }
}
