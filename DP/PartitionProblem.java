import java.util.*;

public class PartitionProblem {
    public static void main(String[] args) {
//https://www.geeksforgeeks.org/partition-problem-dp-18/
  //Given an array arr[] of size N, check if it can be partitioned into two parts
        // such that the sum of elements in both parts is the same.
    }

    static int equalPartitionONE(int N, int arr[])
    {
        //DOne with recursion.
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum +=arr[i];
        }
        if(sum%2==0)
        {
            return helper(N,arr,sum/2);
        }
        else
        {
            return 0;
        }
    }

    static int helper(int N,int arr[],int sum)
    {
        if(sum==0)
        {
            return 1;
        }
        if(N==0)
        {
            if(sum==0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }

        if(arr[N-1]<=sum)
        {
            if(helper(N-1,arr,sum-arr[N-1])==1 || helper(N-1,arr,sum)==1)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }

        return  helper(N-1,arr,sum);

    }

    static int equalPartition(int N, int arr[])
    {
        //Top-down
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum +=arr[i];
        }
        if(sum%2==0)
        {
            int dp[][]=new int[N+1][sum/2+1];
            for(int[] array:dp)
            {
                Arrays.fill(array,-1);
            }
            return helper(N,arr,sum/2,dp);
        }
        else
        {
            return 0;
        }
    }

    static int helper(int N,int arr[],int sum,int[][] dp)
    {
        if(sum==0)
        {
            return 1;
        }
        if(N==0)
        {
            if(sum==0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        if(dp[N][sum]!=-1)
        {
            return dp[N][sum];
        }

        if(arr[N-1]<=sum)
        {
            if(helper(N-1,arr,sum-arr[N-1],dp)==1 || helper(N-1,arr,sum,dp)==1)
            {
                return dp[N][sum]=1;

            }
            else
            {
                return dp[N][sum]=0;
            }
        }

        return dp[N][sum]=helper(N-1,arr,sum,dp);

    }

    static boolean findPartition(int arr[], int n)
    {

        //Bottom-Up
        int sum = 0;
        int i, j;

        // Calculate sum of all elements
        for (i = 0; i < n; i++)
            sum += arr[i];

        if (sum % 2 != 0)
            return false;

        boolean part[][] = new boolean[sum / 2 + 1][n + 1];

        // initialize top row as true
        for (i = 0; i <= n; i++)
            part[0][i] = true;

        // initialize leftmost column, except part[0][0], as
        // 0
        for (i = 1; i <= sum / 2; i++)
            part[i][0] = false;

        // Fill the partition table in bottom up manner
        for (i = 1; i <= sum / 2; i++) {
            for (j = 1; j <= n; j++) {
                part[i][j] = part[i][j - 1];
                if (i >= arr[j - 1])
                    part[i][j]
                            = part[i][j]
                            || part[i - arr[j - 1]][j - 1];
            }
        }

        /* // uncomment this part to print table
        for (i = 0; i <= sum/2; i++)
        {
            for (j = 0; j <= n; j++)
                printf ("%4d", part[i][j]);
            printf("\n");
        } */

        return part[sum / 2][n];
    }
}
