public class FindELementOccursOnce {
    public static void main(String[] args) {

        //Given a sorted array A[] of N positive integers having all the numbers occurring
        // exactly twice, except for one number which will occur only once. Find the number
        // occurring only once.


    }
    public static int search(int A[], int N)
    {
        int i=0;
        int j=N;
        int ans=-1;
        while(i<j)
        {
            int mid=i+((j-i)/2);
            if(mid%2==0)
            {
                if(mid+1<N && A[mid]==A[mid+1])
                {
                    i=mid+1;
                }
                else
                {
                    j=mid;
                }
            }
            else
            {
                if(mid-1>=0 &&A[mid]==A[mid-1])
                {
                    i=mid+1;
                }
                else
                {
                    j=mid;
                }
            }

        }
        return A[i];
    }
}
