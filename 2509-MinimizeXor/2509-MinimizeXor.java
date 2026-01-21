// Last updated: 21/01/2026, 14:32:05
class Solution {
    public int minimizeXor(int num1, int num2) {

        int setBit = Integer.bitCount(num2);
        int x = 0;

        // Step 1: Match bits with num1 from MSB to LSB
        for (int i = 30; i >= 0 && setBit > 0; i--) {
            int mask = (1 << i);
            if ((num1 & mask) != 0) {
                x |= mask;
                setBit--;
            }
        }

        // Step 2: Add remaining bits from LSB to MSB
        for (int i = 0; i <= 30 && setBit > 0; i++) {
            int mask = (1 << i);
            if ((x & mask) == 0) {
                x |= mask;
                setBit--;
            }
        }

        return x;
    }
}
