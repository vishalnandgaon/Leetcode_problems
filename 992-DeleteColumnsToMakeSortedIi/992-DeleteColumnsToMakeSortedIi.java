// Last updated: 27/12/2025, 22:26:32
class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();
        boolean[] sorted = new boolean[n - 1];
        int count = 0;

        for (int col = 0; col < m; col++) {
            boolean delete = false;
            for (int row = 1; row < n; row++) {
                if (!sorted[row - 1]) {
                    if (strs[row - 1].charAt(col) > strs[row].charAt(col)) {
                        delete = true;
                        break;
                    }
                }
            }

            if (delete) {
                count++;
                continue;
            }
            for (int row = 1; row < n; row++) {
                if (!sorted[row - 1] &&
                    strs[row - 1].charAt(col) < strs[row].charAt(col)) {
                    sorted[row - 1] = true;
                }
            }
        }
        return count;
    }
}
