public class FirstIndexofElement {
    public static void main(String[] args) {
        int[] array={1,2,3,3,3,5,6,7};
        int target=7;
        int n=array.length;
        int i=0;
        int j=n-1;
        System.out.println( solve(array,n,i,j,target));

    }
    public static int solve(int[] arr,int n,int i,int j,int target)
    {
        if(i==j)
        {
            return i;
        }
        int mid=(i+j)/2;

        if(arr[mid]==target)
        {
            return solve(arr,n,i,mid,target);
        }
        else if(arr[mid]>target)
        {
            return solve(arr,n,i,mid-1,target);
        }
        else
        {
            return solve(arr,n,mid+1,j,target);
        }
    }
}
