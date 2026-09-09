// Last updated: 09/09/2026, 16:01:57
class Solution {
    public int maxFrequency(int[] nums, int k) {
        int max = 0, ck = 0;
        int[] prefix = new int[51];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == k) {
                ck++;
                prefix[k] = max + 1;
            } else {
                prefix[nums[i]] = Math.max(prefix[nums[i]], ck) + 1;
            }
            max = Math.max(max, prefix[nums[i]]);
        }

        return max;
    }
}