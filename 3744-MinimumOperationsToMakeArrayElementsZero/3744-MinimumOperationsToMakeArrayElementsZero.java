// Last updated: 06/09/2025, 21:53:23
class Solution {
    public long minOperations(int[][] queries) {
        long ans = 0;
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            ans += (getOperations(r) - getOperations(l - 1) + 1) / 2;
        }
        return ans;
    }

    // Returns the number of individual "divide-by-4" steps needed from 1 to n
    private long getOperations(int n) {
        long res = 0;
        int ops = 0;
        for (long powerOfFour = 1; powerOfFour <= n; powerOfFour *= 4) {
            long left = powerOfFour;
            long right = Math.min(n, powerOfFour * 4 - 1);
            ops++;
            res += (right - left + 1) * ops;
        }
        return res;
    }
}
