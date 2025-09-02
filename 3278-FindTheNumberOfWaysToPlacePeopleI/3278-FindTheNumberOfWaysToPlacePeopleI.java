// Last updated: 02/09/2025, 13:48:45
import java.util.Arrays;

class Solution {
    public int numberOfPairs(int[][] points) {
        // Sort by x ascending; for equal x, by y descending
        Arrays.sort(points, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);

        int ans = 0;
        int n = points.length;
        final int NEG_INF = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int y1 = points[i][1];
            int maxY = NEG_INF;

            for (int j = i + 1; j < n; j++) {
                int y2 = points[j][1];
                if (y2 <= y1 && y2 > maxY) {
                    ans++;
                    maxY = y2;
                }
            }
        }

        return ans;
    }
}
