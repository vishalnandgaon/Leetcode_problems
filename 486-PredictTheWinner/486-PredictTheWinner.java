// Last updated: 11/10/2025, 23:35:35
class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) dp[i] = nums[i];
        for (int len = 2; len <= n; len++)
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;
                dp[i] = Math.max(nums[i] - dp[i+1], nums[j] - dp[i]);
            }
        return dp[0] >= 0;
    }
}
