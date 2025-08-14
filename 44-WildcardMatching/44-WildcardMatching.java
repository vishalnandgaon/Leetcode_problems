// Last updated: 14/08/2025, 11:35:01
/*class Solution {
    public boolean isMatch(String s, String p) {
        
    }
}*/
public class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        
        // dp[i][j] will be true if s[0..i-1] matches p[0..j-1]
        boolean[][] dp = new boolean[m + 1][n + 1];
        
        // Initialize dp[0][0] = true, as both strings are empty
        dp[0][0] = true;
        
        // Handle patterns like "*" at the beginning of the pattern
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }
        
        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '?') {
                    // If characters match or we have '?', carry forward the diagonal value
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    // '*' can match zero or more characters
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }
            }
        }
        
        // The result is in the bottom-right corner
        return dp[m][n];
    }
}
