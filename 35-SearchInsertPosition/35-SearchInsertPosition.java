// Last updated: 14/08/2025, 11:35:15
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l1 = nums.length;
        int ans = l1;
        for (int i = 0; i < l1; i++) {
            if (nums[i] == target) {
                ans = i;
                break;
            } else if (target < nums[i]) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
