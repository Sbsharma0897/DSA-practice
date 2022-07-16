public class BookAllocationProblem {
    public static void main(String[] args) {

    }
    public static int findPages(int[]A,int N,int M)
    {
        int min=0;
        int max=0;
        for(var i=0;i<N;i++)
        {
            max=max+A[i];
        }
        int ans=-1;

        while(min<=max)
        {
            int mid=(min+max)/2;
            if(isPossible(A,N,M,mid))
            {
                ans=mid;
                max=mid-1;
            }
            else
            {
                min=mid+1;
            }
        }
        return ans;

    }

    static boolean isPossible(int[] A,int N,int M,int max)
    {
        int studentCount=1;
        int pageSum=0;

        for(var i=0;i<N;i++)
        {
            if(pageSum+A[i]<=max)
            {
                pageSum +=A[i];
            }
            else
            {
                studentCount++;
                if(studentCount>M || A[i]>max)
                {
                    return false;
                }
                pageSum=A[i];
            }
        }
        return studentCount<=M;
    }
}
