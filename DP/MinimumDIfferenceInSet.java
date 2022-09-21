public class MinimumDIfferenceInSet {
    Time Complexity: O(2^N)
    Space Complexity: O(N)

    Where N is the number of elements in the array.
            */

    public class Solution {

        private static int subsetMin(int[] arr, int n, int pathsum, int sum) {
            // No more elements to explore along this depth of the recursion tree.
            if (n == 0) {
                return Math.abs(sum - 2 * pathsum);
            }

            // For each element we have two choices either to include it in the subset or not.
            // So here we explore both the possibilities and choose the one which gives us the min subset sum difference.
            return Math.min(subsetMin(arr, n - 1, pathsum + arr[n - 1], sum), subsetMin(arr, n - 1, pathsum, sum));
        }

        public static int minSubsetSumDifference(int[] arr, int n) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }

            return subsetMin(arr, n, 0, sum);
        }

    }







    /*
	Time Complexity: O(N * SUM)
	Space Complexity: O(N * SUM)

	Where N is the number of elements in the array and SUM denotes the sum of all the elements in the array.
*/

    public class Solution {
        public static int minSubsetSumDifference(int[] arr, int n) {
            int sum = 0, res = 0, ans = 0;
            // Calculating the sum of all the array elements.
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }

            res = sum;
            if (sum % 2 == 0) {
                sum /= 2;
            }

            else {
                sum = (sum + 1) / 2;
            }

            boolean[][] dp = new boolean[n + 1][sum + 1];
            // Initializing the dp with its initial state.
            for (int i = 0; i <= n; i++) {
                dp[i][0] = true;
            }

            // Calculating the value of each state of the dp.
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= sum; j++) {
                    if (arr[i - 1] > j) {
                        dp[i][j] = dp[i - 1][j];
                    }

                    else {
                        dp[i][j] = dp[i - 1][j] | dp[i - 1][j - arr[i - 1]];
                    }
                }
            }

            for (int i = sum; i >= 0; i--) {
                if (dp[n][i]) {
                    // Here i represents the path sum.
                    ans = Math.abs(res - 2 * i);
                    break;
                }
            }

            return ans;
        }

    }

}
