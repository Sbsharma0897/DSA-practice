public class FindMissingandRepeating {
    public static void main(String[] args) {
//https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
      //Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2, …N} is
        // missing and one number 'B' occurs twice in array. Find these two numbers.
    }
    int[] findTwoElement(int arr[], int n) {
//since its a set of 1-n, use the same array to mark the occurerd number by making that index as negative,
        //by this if any element occurs twice we would already be given a negaitve value nunber .

        int twice=0;
        int missing=0;
        for(var i=0;i<n;i++)
        {
            var temp=Math.abs(arr[i]);
            if(arr[temp-1]<0)
            {
                twice=temp;

            }
            else
            {
                arr[temp-1]=-arr[temp-1];
            }
        }
        for(var i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                missing=i+1;
            }
        }


        int [] array={twice,missing};
        return array;
    }

}
