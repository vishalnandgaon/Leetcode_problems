// Last updated: 09/09/2026, 16:03:34
class Solution {
    public char kthCharacter(int k) {
        // bitCount(k-1) gives number of bits set in (k-1)
        return (char) ('a' + Integer.bitCount(k - 1));
    }
}
