// Last updated: 14/08/2025, 11:34:37
public class Solution {
    public int uniquePaths(int m, int n) {
        // Create a DP table with m rows and n columns
        int[][] dp = new int[m][n];
        
        // Initialize the first row and first column
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;  // There's only one way to reach any cell in the first column (down).
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;  // There's only one way to reach any cell in the first row (right).
        }
        
        // Fill the DP table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];  // Sum of ways from top and left
            }
        }
        
        // The bottom-right corner will contain the number of unique paths
        return dp[m-1][n-1];
    }
}
