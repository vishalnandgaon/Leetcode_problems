// Last updated: 28/10/2025, 23:54:30
class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) continue;

            // try both directions: -1 (left) and +1 (right)
            for (int dir : new int[]{-1, 1}) {
                int[] arr = nums.clone(); // make a copy for simulation
                int curr = i;
                int d = dir;

                while (curr >= 0 && curr < n) {
                    if (arr[curr] == 0) {
                        curr += d;
                    } else {
                        arr[curr]--;
                        d = -d;
                        curr += d;
                    }
                }

                boolean allZero = true;
                for (int val : arr) {
                    if (val != 0) {
                        allZero = false;
                        break;
                    }
                }
                if (allZero) ans++;
            }
        }
        return ans;
    }
}
