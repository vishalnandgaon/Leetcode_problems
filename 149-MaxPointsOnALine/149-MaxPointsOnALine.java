// Last updated: 14/08/2025, 11:34:12
/*class Solution {
    public int maxPoints(int[][] points) {
        
    }
}*/
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxPoints(int[][] points) {
        if (points.length <= 2) return points.length;

        int maxPoints = 1;

        for (int i = 0; i < points.length; i++) {
            Map<String, Integer> slopeMap = new HashMap<>();
            int duplicate = 0;
            int maxPointsOnLine = 1;

            for (int j = i + 1; j < points.length; j++) {
                int xDiff = points[j][0] - points[i][0];
                int yDiff = points[j][1] - points[i][1];

                // Check for duplicate points
                if (xDiff == 0 && yDiff == 0) {
                    duplicate++;
                    continue;
                }

                // Simplify the slope by calculating gcd
                int gcd = gcd(xDiff, yDiff);
                xDiff /= gcd;
                yDiff /= gcd;

                // To handle direction of the slope consistently
                if (xDiff < 0) {
                    xDiff = -xDiff;
                    yDiff = -yDiff;
                }

                String slope = xDiff + "_" + yDiff;
                slopeMap.put(slope, slopeMap.getOrDefault(slope, 1) + 1);
                maxPointsOnLine = Math.max(maxPointsOnLine, slopeMap.get(slope));
            }

            maxPoints = Math.max(maxPoints, maxPointsOnLine + duplicate);
        }

        return maxPoints;
    }

    // Helper function to calculate gcd
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
