// Last updated: 04/01/2026, 23:52:36
class Solution {
    public int numOfWays(int n) {
        long mod = 1_000_000_007;

        long abc = 6; // all different colors
        long aba = 6; // first and third same

        for (int i = 2; i <= n; i++) {
            long newABC = (2 * abc + 2 * aba) % mod;
            long newABA = (2 * abc + 3 * aba) % mod;

            abc = newABC;
            aba = newABA;
        }

        return (int)((abc + aba) % mod);
    }
}
