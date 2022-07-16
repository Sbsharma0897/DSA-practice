public class PaintersPartition {
    public static void main(String[] args) {
        
    }
    static long minTime(int[] A,int N,int M){
        long min=0;
        long max=0;
        for(var i=0;i<N;i++)
        {
            max=max+A[i];
        }

        long ans=-1;

        while(min<=max)
        {
            long mid=(min+max)/2;

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
    static boolean isPossible(int[] A,int N,int M,long max)
    {
        int studentCount=1;
        long pageSum=0;


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

        return true;
    }
}
