// Last updated: 21/08/2025, 23:40:12
class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int total = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1; // first row or col
                    } else {
                        dp[i][j] = 1 + Math.min(dp[i-1][j], 
                                         Math.min(dp[i][j-1], dp[i-1][j-1]));
                    }
                    total += dp[i][j];
                }
            }
        }
        
        return total;
    }
}
