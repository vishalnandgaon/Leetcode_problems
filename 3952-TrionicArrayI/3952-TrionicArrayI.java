// Last updated: 05/10/2025, 09:09:14
class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;

        int i = 0;

        // First strictly increasing
        while (i < n - 1 && nums[i] < nums[i + 1]) {
            i++;
        }
        int p = i;
        if (p == 0 || p >= n - 2) return false; 
        // p >= n-2 means no room for decrease + final increase

        // Strictly decreasing
        while (i < n - 1 && nums[i] > nums[i + 1]) {
            i++;
        }
        int q = i;
        if (q == p || q >= n - 1) return false; 
        // q == p → no decreasing part
        // q == n-1 → no final increasing part

        // Last strictly increasing
        while (i < n - 1 && nums[i] < nums[i + 1]) {
            i++;
        }

        // If we ended at the last element, it's trionic
        return i == n - 1;
    }
}
