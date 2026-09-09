// Last updated: 09/09/2026, 16:06:46
class Solution {
    public long maximumTripletValue(int[] nums) {

        int n = nums.length;

        int[] prefixmax = new int[n];
        int[] prefixmin = new int[n];

        prefixmax[0] = nums[0];
        prefixmin[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefixmax[i] = Math.max(prefixmax[i - 1], nums[i]);
            prefixmin[i] = Math.min(prefixmin[i - 1], nums[i]);
        }

        int[] suffixmax = new int[n];
        int[] suffixmin = new int[n];

        suffixmax[n - 1] = nums[n - 1];
        suffixmin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixmax[i] = Math.max(suffixmax[i + 1], nums[i]);
            suffixmin[i] = Math.min(suffixmin[i + 1], nums[i]);
        }

        long ans = Long.MIN_VALUE;

        for (int j = 1; j < n - 1; j++) {

            int premax = prefixmax[j - 1];
            int premin = prefixmin[j - 1];

            int suffmax = suffixmax[j + 1];
            int suffmin = suffixmin[j + 1];

            ans = Math.max(ans, (long)(premax - nums[j]) * suffmax);
            ans = Math.max(ans, (long)(premax - nums[j]) * suffmin);
            ans = Math.max(ans, (long)(premin - nums[j]) * suffmax);
            ans = Math.max(ans, (long)(premin - nums[j]) * suffmin);
        }

        return Math.max(ans, 0);
    }
}