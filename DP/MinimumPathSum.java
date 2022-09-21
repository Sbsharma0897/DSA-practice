public class MinimumPathSum {
    public static void main(String[] args) {
     //https://www.codingninjas.com/codestudio/problems/minimum-path-sum_985349?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos
    }
    public class Solution {

        public static int minSumPath(int[][] grid) {
            //  Time Complexity: O(N * M)
            //    Space Complexity: O(N * M)
            int n = grid.length;
            int m = grid[0].length;

            // Declaring a table to keep the value of already calculated subproblems.
            int[][] lookUp = new int[n][m];
            for(int i = 0; i < n; i++){
                Arrays.fill(lookUp[i], -1);
            }

            // Calling the helper function to calculate the minimum sum path.
            int minSum = minSumHelper(grid, lookUp, 0, 0, n, m);
            return minSum;
        }

        public static int minSumHelper(int[][] grid, int[][] lookUp, int i, int j, int n, int m) {
            // If indexes are out of range then return a very large value.
            if (i >= n || j >= m) {
                return Integer.MAX_VALUE;
            }
            // If it is bottom right end of the grid then return its value.
            if (i == n - 1 && j == m - 1) {
                return grid[i][j];
            }

            // If the ans for subproblem already exist.
            if (lookUp[i][j] != -1) {
                return lookUp[i][j];
            }

            // Check in both the directions.
            int right = minSumHelper(grid, lookUp, i, j + 1, n, m);
            int down = minSumHelper(grid, lookUp, i + 1, j, n, m);

            // Storing the ans for furthur use.
            lookUp[i][j] = grid[i][j] + Math.min(right, down);
            return lookUp[i][j];
        }

    }




    public class Solution {
        public static int minSumPath(int[][] grid) {
            int n = grid.length;
            int m = grid[0].length;

            // Iterating all the grid cells.
            for (int i = n - 1; i >= 0; i--) {
                for (int j = m - 1; j >= 0; j--) {
                    // If it is the bottom rightmost cell.
                    if (i == n - 1 && j == m - 1) {
                        continue;
                    }
                    // If the cell is in last row.
                    else if (i == n - 1) {
                        grid[i][j] = grid[i][j] + grid[i][j + 1];
                    }
                    // If the cell is in last column.
                    else if (j == m - 1) {
                        grid[i][j] = grid[i][j] + grid[i + 1][j];
                    }
                    // Else store the value which will be minimum of both the directions.
                    else {
                        grid[i][j] = grid[i][j] + Math.min(grid[i + 1][j], grid[i][j + 1]);
                    }
                }
            }
            // Return the minimum path sum.
            return grid[0][0];
        }
    }

}
