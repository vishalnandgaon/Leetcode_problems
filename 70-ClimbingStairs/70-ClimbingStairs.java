// Last updated: 14/08/2025, 11:34:26
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n; // Base cases
        }
        
        int first = 1; // dp[1]
        int second = 2; // dp[2]
        int current = 0;
        
        for (int i = 3; i <= n; i++) {
            current = first + second; // dp[i] = dp[i-1] + dp[i-2]
            first = second;
            second = current;
        }
        
        return current;

    }
}