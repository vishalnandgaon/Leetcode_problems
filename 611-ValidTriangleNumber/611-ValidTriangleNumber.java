// Last updated: 27/09/2025, 22:28:40
import java.util.*;

class Solution {
    private int binarySearch(int l, int r, int target, int[] nums) {
        int k = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                k = mid; 
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return k;
    }

    public int triangleNumber(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0;

        Arrays.sort(nums);
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) continue; 
            for (int j = i + 1; j < n; j++) {
                int sum = nums[i] + nums[j];
                int k = binarySearch(j + 1, n - 1, sum, nums);
                if (k != -1) {
                    count += (k - j);
                }
            }
        }

        return count;
    }
}
