// Last updated: 01/10/2025, 17:49:40
import java.util.*;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int ans = 0;
        int boxplaced = 0;

        for (int i = 0; i < boxTypes.length && boxplaced < truckSize; i++) {
            int canTake = Math.min(boxTypes[i][0], truckSize - boxplaced);
            ans += canTake * boxTypes[i][1];
            boxplaced += canTake;
        }

        return ans;
    }
}
