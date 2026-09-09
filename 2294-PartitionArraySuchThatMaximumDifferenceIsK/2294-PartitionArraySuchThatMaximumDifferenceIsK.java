// Last updated: 09/09/2026, 16:10:04
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
