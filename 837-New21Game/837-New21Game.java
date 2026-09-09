// Last updated: 09/09/2026, 16:24:44
public class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if (k == 0 || n >= k + maxPts) {
            return 1.0;
        }

        double[] dp = new double[n + 1];
        dp[0] = 1.0;
        double Wsum = 1.0;
        double result = 0.0;

        for (int i = 1; i <= n; i++) {
            dp[i] = Wsum / maxPts;
            if (i < k) {
                Wsum += dp[i];
            } else {
                result += dp[i];
            }

            if (i - maxPts >= 0) {
                Wsum -= dp[i - maxPts];
            }
        }

        return result;
    }
}
    