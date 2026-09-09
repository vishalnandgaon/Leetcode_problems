// Last updated: 09/09/2026, 15:57:24
class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;

        for (int x = num1; x <= num2; x++) {
            ans += waviness(x);
        }

        return ans;
    }

    private int waviness(int x) {
        String s = String.valueOf(x);
        int count = 0;

        for (int i = 1; i < s.length() - 1; i++) {
            int left = s.charAt(i - 1) - '0';
            int mid = s.charAt(i) - '0';
            int right = s.charAt(i + 1) - '0';

            if ((mid > left && mid > right) ||
                (mid < left && mid < right)) {
                count++;
            }
        }

        return count;
    }
}