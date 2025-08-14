// Last updated: 14/08/2025, 11:34:46
public class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;
        int n = nums.length;

        // Iterate over the array
        for (int i = 0; i < n; i++) {
            // If the current index is beyond the farthest point we can reach, return false
            if (i > farthest) {
                return false;
            }
            // Update the farthest point we can reach
            farthest = Math.max(farthest, i + nums[i]);

            // If we can reach or exceed the last index, return true
            if (farthest >= n - 1) {
                return true;
            }
        }

        // If we've finished the loop, return true if we can reach the last index
        return farthest >= n - 1;
    }
}
