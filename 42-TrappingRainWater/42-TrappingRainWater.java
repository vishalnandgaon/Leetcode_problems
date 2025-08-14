// Last updated: 14/08/2025, 11:35:05
class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int trappedWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                // Process the left side
                if (height[left] >= leftMax) {
                    leftMax = height[left]; // Update left max
                } else {
                    trappedWater += leftMax - height[left]; // Calculate water trapped
                }
                left++; // Move the left pointer inward
            } else {
                // Process the right side
                if (height[right] >= rightMax) {
                    rightMax = height[right]; // Update right max
                } else {
                    trappedWater += rightMax - height[right]; // Calculate water trapped
                }
                right--; // Move the right pointer inward
            }
        }

        return trappedWater;
    }
}
