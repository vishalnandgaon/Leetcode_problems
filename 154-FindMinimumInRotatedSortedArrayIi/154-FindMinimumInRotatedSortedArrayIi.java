// Last updated: 09/09/2026, 16:33:24
class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}