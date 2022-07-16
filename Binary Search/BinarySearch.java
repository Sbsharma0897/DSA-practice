public class BinarySearch {
    public static void main(String[] args) {
        int[] array={3,6,7,9,12,15,18};
        int n=array.length;
        int k=18;
        System.out.println(binarySearch(array,n,k));
    }
    public static int binarySearch(int[] array,int n,int k)
    {
        int i=0;
        int j=n-1;
        int ans=-1;

        while(i<=j)
        {
            int mid=(i+j)/2;

            if(array[mid]==k)
            {
                ans=1;
                return ans;
            }
            else if(array[mid]>k)
            {
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
