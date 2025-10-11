// Last updated: 11/10/2025, 23:35:18
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0; // No product can be < 1 if k <= 1
        
        int left = 0;
        int count = 0;
        long product = 1;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            
            // shrink the window if product >= k
            while (product >= k) {
                product /= nums[left];
                left++;
            }
            
            // all subarrays ending at right are valid
            count += (right - left + 1);
        }
        
        return count;
    }
}
