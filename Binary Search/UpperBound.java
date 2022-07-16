public class UpperBound {

    public static void main(String[] args) {
        int[] array={2,3,3,3,4,5,6,7};
        int n=array.length;
        int k=3;
        System.out.println(binarySearch(array,n,k));
    }
    public static int binarySearch(int[] array,int n,int k)
    {
        int i=0;
        int j=n-1;
        int ans=-1;

        while(i<=j)
        {
            int mid=((i+j)/2);

            if(array[mid]==k)
            {
                i=mid+1;
            }
            else if(array[mid]>k)
            {
                ans=mid;
                j=mid-1;
            }
            else
            {
                i=mid+1;
            }
        }
        return ans;
    }

}
