// Last updated: 09/09/2026, 16:07:39
class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        // Enumerate possible number of operations k from 0 up to 60
        for (long k = 0; k <= 60; ++k) {
            long x = num1 - k * num2;
            if (x < 0) {
                continue; // Too few remaining, try higher k
            }
            // Check if x can be expressed as sum of k powers of two
            if (Long.bitCount(x) <= k && k <= x) {
                return (int) k;
            }
        }
        return -1;
    }
}
