public class MaxProductSubset {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/maximum-product-subset-of-an-array/1
  //Given an array A[]. The task is to find the maximum product possible with the subset of elements present in the array. The maximum product can be a single element also.
        //Since the product can be large, return it modulo (109 + 7)
    }
    public static int findMaxProduct(int n, int[] arr) {

        if(n==1)
        {
            return arr[0];
        }
        int mod=1000000007;
        long product=1;
        int zero=0;
        int pos=0;
        int minus=0;
        int minabs=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                minabs=Math.max(arr[i],minabs);
                minus++;
            }
            else if(arr[i]==0)
            {
                zero++;
                continue;
            }
            else
            {
                pos++;
            }
            product =(product*arr[i])%mod;
        }

        if(minus%2==1){
            if(minus==1 && zero>=1 && ((minus+zero)==n)){
                return 0;
            }
            else  {
                return (int)(product/minabs);
            }
        }
        else {
            return (int)product;
        }



    }
}
