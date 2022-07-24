public class SearchInArraywithDiffK {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/searching-in-an-array-where-adjacent-differ-by-at-most-k0456/1
        //A step array is an array of integer where each element has a difference of at
        // most k with its neighbor. Given a key x, we need to find the index value of x
        // if multiple elements exist, return the first occurrence of the key.
    }
    public static int search (int arr[], int n, int x, int k) {

        int i=0;

        int mid=0;
        int ans=-1;

        while(i<n)
        {

            if(arr[i]==x)
            {
                ans=i;
                break;
            }

            int y=Math.max(1,(Math.abs(arr[i]-x)/k));

            i=i+y;

        }
        return ans;
    }

}
