// Last updated: 14/08/2025, 11:34:32
public class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Use a 1D DP array to store the current row's results
        int[] dp = new int[n];

        // Initialize the first cell
        dp[0] = grid[0][0];

        // Fill the first row (can only come from the left)
        for (int j = 1; j < n; j++) {
            dp[j] = dp[j-1] + grid[0][j];
        }

        // Process the rest of the rows
        for (int i = 1; i < m; i++) {
            // For the first column, only comes from above
            dp[0] += grid[i][0];

            // Process the rest of the row
            for (int j = 1; j < n; j++) {
                dp[j] = grid[i][j] + Math.min(dp[j], dp[j-1]);
            }
        }

        // Return the last element in the DP array, which holds the minimum path sum to the bottom-right corner
        return dp[n-1];
    }
}
