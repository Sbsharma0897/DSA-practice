public class SearchINRotatedSortedArray {
    class Solution {
        public int search(int[] arr, int target) {

            int i=0;
            int j=arr.length-1;
            int mid=0;
            while(i<=j)
            {
                mid=(i+j)/2;

                if(mid+1<=j && arr[mid]>arr[mid+1])
                {
                    break;
                }
                else if(mid-1>=i && arr[mid-1]>arr[mid])
                {
                    mid=mid-1;
                    break;
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

            for(i=0;i<=mid;i++)
            {
                if(target==arr[i])
                {
                    return i;
                }
            }
            for(i=mid+1;i<arr.length;i++)
            {
                if(target==arr[i])
                {
                    return i;
                }
            }
            return -1;



        }
    }
}
