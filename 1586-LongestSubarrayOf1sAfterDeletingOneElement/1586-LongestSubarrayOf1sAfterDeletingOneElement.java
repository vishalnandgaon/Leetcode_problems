// Last updated: 29/08/2025, 22:06:25
class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, zeroCount = 0, maxLen = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            
            // Shrink window if more than 1 zero
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            
            // Window size - 1 (since one element must be deleted)
            maxLen = Math.max(maxLen, right - left);
        }
        
        return maxLen;
    }
}
