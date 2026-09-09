// Last updated: 09/09/2026, 16:21:23
class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        int i = 0; // pointer for ans
        int j = 0; // pointer for arr

        while (i < n && j < n) {
            if (arr[j] == 0) {
                ans[i++] = 0;
                if (i < n) ans[i++] = 0;  // boundary check
            } else {
                ans[i++] = arr[j];
            }
            j++;
        }

        // copy back to original array
        for (int k = 0; k < n; k++) {
            arr[k] = ans[k];
        }
    }
}
