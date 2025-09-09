// Last updated: 09/09/2025, 07:32:27
class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = 1000000007;
        long[] dp = new long[n + 1];
        dp[1] = 1;

        for (int day = 1; day <= n; day++) {
            for (int next = day + delay; next < day + forget && next <= n; next++) {
                dp[next] = (dp[next] + dp[day]) % MOD;
            }
        }
        long result = 0;
        for (int i = n - forget + 1; i <= n; i++) {
            if (i > 0) result = (result + dp[i]) % MOD;
        }

        return (int) result;
    }
}
