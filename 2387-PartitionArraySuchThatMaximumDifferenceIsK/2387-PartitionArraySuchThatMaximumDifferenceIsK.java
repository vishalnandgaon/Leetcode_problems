// Last updated: 06/10/2025, 23:23:37
import java.util.Arrays;

class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int subsequences = 1;
        int min = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            if (min + k < nums[i]) {
                ++subsequences;
                min = nums[i];
            }
        }

        return subsequences;
    }
}
