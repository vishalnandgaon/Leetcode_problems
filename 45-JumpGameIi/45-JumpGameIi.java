// Last updated: 14/08/2025, 11:35:00
/*class Solution {
    public int jump(int[] nums) {
        
    }
}*/
public class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0; // No jumps needed if we're already at the last index

        int jumps = 0;
        int current_end = 0;
        int farthest = 0;

        for (int i = 0; i < n; i++) {
            farthest = Math.max(farthest, i + nums[i]); // Calculate the farthest point we can reach

            if (i == current_end) { // When we reach the end of the current jump range
                jumps++;  // We need to make a jump
                current_end = farthest; // Move to the farthest point

                if (current_end >= n - 1) { // If we can reach or exceed the last index
                    break;
                }
            }
        }

        return jumps;
    }
}
