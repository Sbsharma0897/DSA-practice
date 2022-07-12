public class PartitionKEqual {
    public static void main(String[] args) {

        //Given an integer array a[ ] of N elements and an integer K, the task is to check if the array a[ ] could be divided into K non-empty subsets with equal sum of elements.
        //Note: All elements of this array should be part of exactly one partition.
        int[] array={4, 3 ,2 ,3, 5, 2, 1};
        boolean[] visited=new boolean[7];
        int k=3;
        int sum=0;
        int totalsum=0;
        for (int i = 0; i < array.length; i++)
        {
            totalsum=totalsum+array[i];
        }
        if(k==1)
        {
            System.out.println(1);
        }
        if(totalsum%k!=0)
        {
            System.out.println(0);
        }
        int indisum=totalsum/k;

        System.out.println(solve(array,visited,k,sum,indisum));
    }

    private static int solve(int[] array, boolean[] visited, int k, int sum,int indisum)
    {
        if(sum==indisum)
        {
            sum=0;
            k=k-1;
        }
        if(k==0)
        {
            return 1;
        }

        if(sum>indisum || k<0)
        {
            return 0;
        }

        for (int i = 0; i < array.length; i++)
        {
            if(visited[i]==true)
            {
                continue;
            }
            visited[i]=true;
            int temp=solve(array,visited,k,sum+array[i],indisum);
            if(temp==1)
            {
                return 1;
            }
            visited[i]=false;
        }

        return 0;
    }


}
