// Last updated: 09/09/2026, 16:02:18
class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] freq = new int[51];

        for (int start = 0; start <= n - k; start++) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = start; j < start + k; j++) {
                set.add(nums[j]);
            }

            for (int x : set) {
                freq[x]++;
            }
        }

        for (int i = 50; i >= 0; i--) {
            if (freq[i] == 1) {
                return i;
            }
        }

        return -1;
    }
}