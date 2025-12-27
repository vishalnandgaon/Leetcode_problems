// Last updated: 27/12/2025, 22:26:34
class Solution {
    private int max = -1;

    public String largestTimeFromDigits(int[] arr) {
        boolean[] used = new boolean[4];
        backtrack(arr, used, new int[4], 0);

        if (max == -1) return "";

        int hour = max / 60;
        int minute = max % 60;
        return String.format("%02d:%02d", hour, minute);
    }

    private void backtrack(int[] arr, boolean[] used, int[] perm, int idx) {
        if (idx == 4) {
            int h = perm[0] * 10 + perm[1];
            int m = perm[2] * 10 + perm[3];
            if (h < 24 && m < 60) {
                max = Math.max(max, h * 60 + m);
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (!used[i]) {
                used[i] = true;
                perm[idx] = arr[i];
                backtrack(arr, used, perm, idx + 1);
                used[i] = false;
            }
        }
    }
}
