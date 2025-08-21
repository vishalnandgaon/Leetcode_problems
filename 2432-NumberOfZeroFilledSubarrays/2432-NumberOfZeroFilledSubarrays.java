// Last updated: 21/08/2025, 23:40:07
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
