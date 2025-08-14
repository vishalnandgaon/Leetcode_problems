// Last updated: 14/08/2025, 11:34:49
public class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize variables
        int maxCurrent = nums[0]; // The current subarray sum
        int maxGlobal = nums[0];  // The maximum sum found so far
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update the current subarray sum
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            // Update the global maximum sum
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }
        
        return maxGlobal; // Return the maximum subarray sum
    }
}
