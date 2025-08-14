// Last updated: 14/08/2025, 11:34:44
import java.util.*;

public class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals by the start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Step 2: Initialize a list to hold the merged intervals
        List<int[]> merged = new ArrayList<>();

        // Step 3: Iterate through the intervals and merge when necessary
        for (int[] interval : intervals) {
            // If merged is empty or no overlap, just add the interval
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // There is overlap, so merge the intervals
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // Step 4: Convert the result list to a 2D array and return
        return merged.toArray(new int[merged.size()][]);
    }
}
