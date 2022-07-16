public class RotationCount {
    public static void main(String[] args) {

    }
    int findKRotation(int arr[], int n) {

        int pivot=findPivot(arr);
        if(pivot==-1)
        {
            return 0;
        }
        return pivot+1;

    }
    static int findPivot(int[] arr)
    {
        int i=0;
        int j=arr.length-1;

        while(i<=j)
        {
            int mid=(i+j)/2;

            if(mid+1<=j && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(mid-1>=i && arr[mid-1]>arr[mid+1])
            {
                return mid-1;
            }
            else if(arr[mid]>=arr[i])
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
        }
        return -1;
    }
}
