// Last updated: 09/09/2026, 16:09:43
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long zeros = 0;

        for (int num : nums) {
            if (num == 0) {
                zeros++;
                count += zeros;
            } else {
                zeros = 0;
            }
        }

        return count;
    }
}
