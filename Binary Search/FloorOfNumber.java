public class FloorOfNumber {
    public static void main(String[] args) {

    }
    static int findFloor(long arr[], int n, long x)
    {
        if(x<arr[0])
        {
            return -1;
        }
        var i=0;
        var j=n-1;
        int ans=-1;
        while(i<=j)
        {
            var mid=(i+j)/2;

            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid]<x)
            {
                ans=mid;
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
        }
        return ans;
    }
}
