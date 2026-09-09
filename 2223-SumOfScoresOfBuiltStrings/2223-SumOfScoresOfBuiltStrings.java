// Last updated: 09/09/2026, 16:10:30
class Solution {

    public long sumScores(String s) {

        int n = s.length();

        int[] z = new int[n];

        int left = 0;
        int right = 0;

        for (int i = 1; i < n; i++) {

            // inside Z-box
            if (i <= right) {

                z[i] = Math.min(right - i + 1,
                                z[i - left]);
            }

            // expand match
            while (i + z[i] < n &&
                   s.charAt(z[i]) == s.charAt(i + z[i])) {

                z[i]++;
            }

            // update box
            if (i + z[i] - 1 > right) {

                left = i;
                right = i + z[i] - 1;
            }
        }

        long sum = n;

        for (int val : z) {
            sum += val;
        }

        return sum;
    }
}