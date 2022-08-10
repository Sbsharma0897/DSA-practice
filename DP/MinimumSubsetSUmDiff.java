public class MinimumSubsetSUmDiff {
    public static void main(String[] args) {
  //https://practice.geeksforgeeks.org/problems/minimum-sum-partition3317/1
        //Given an array arr of size N containing non-negative integers, the task is
        // to divide it into two sets S1 and S2 such that the absolute difference between
        // their sums is minimum and find the minimum difference
    }
    public static int findMinRec(int arr[], int i,
                                 int sumCalculated,
                                 int sumTotal)
    {
        //RECURSION
        // If we have reached last element.
        // Sum of one subset is sumCalculated,
        // sum of other subset is sumTotal-
        // sumCalculated.  Return absolute
        // difference of two sums.
        if (i == 0)
            return Math.abs((sumTotal - sumCalculated)
                    - sumCalculated);

        // For every item arr[i], we have two choices
        // (1) We do not include it first set
        // (2) We include it in first set
        // We return minimum of two choices
        return Math.min(
                findMinRec(arr, i - 1,
                        sumCalculated + arr[i - 1],
                        sumTotal),
                findMinRec(arr, i - 1, sumCalculated,
                        sumTotal));
    }

    // Returns minimum possible difference between
    // sums of two subsets
    public static int findMin(int arr[], int n)
    {
        // Compute total sum of elements
        int sumTotal = 0;
        for (int i = 0; i < n; i++)
            sumTotal += arr[i];

        // Compute result using recursive function
        return findMinRec(arr, n, 0, sumTotal);
    }








    static int findMinDP(int arr[], int n)
    {
        //Here we are first puttig values in table and then checking the table for sum values;

        // Calculate sum of all elements
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];

        // Create an array to store
        // results of subproblems
        boolean dp[][] = new boolean[n + 1][sum + 1];

        // Initialize first column as true.
        // 0 sum is possible  with all elements.
        for (int i = 0; i <= n; i++)
            dp[i][0] = true;

        // Initialize top row, except dp[0][0],
        // as false. With 0 elements, no other
        // sum except 0 is possible
        for (int i = 1; i <= sum; i++)
            dp[0][i] = false;

        // Fill the partition table
        // in bottom up manner
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                // If i'th element is excluded
                dp[i][j] = dp[i - 1][j];

                // If i'th element is included
                if (arr[i - 1] <= j)
                    dp[i][j] |= dp[i - 1][j - arr[i - 1]];
            }
        }

        // Initialize difference of two sums.
        int diff = Integer.MAX_VALUE;

        // Find the largest j such that dp[n][j]
        // is true where j loops from sum/2 t0 0
        for (int j = sum / 2; j >= 0; j--) {
            // Find the
            if (dp[n][j] == true) {
                diff = sum - 2 * j;
                break;
            }
        }
        return diff;
    }








    public int minDifference(int arr[], int N)
    {
        //DP, done by me ,here we are making table once and then for even sum value we are calling the
        //function to find if sum subset is there or not, it does ecxtra function calls compareed to previous
        //method
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum +=arr[i];
        }
        boolean dp[][]=new boolean[N+1][sum+1];

        for(int j=0;j<sum+1;j++)
        {
            dp[0][j]=false;
        }
        for(int i=0;i<N+1;i++)
        {
            dp[i][0]=true;
        }

        int halfsum=sum/2;
        while(halfsum>=0)
        {
            if(isSubsetSum(N,arr,halfsum,dp))
            {
                return Math.abs((sum-halfsum)-halfsum);
            }
            else
            {
                halfsum--;
            }
        }
        return 0;
    }
    static Boolean isSubsetSum(int N, int arr[], int sum,boolean[][] dp)
    {


        for(int i=1;i<N+1;i++)
        {
            for(int j=1;j<sum+1;j++)
            {
                if(arr[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[N][sum];

    }

}
