// Last updated: 14/08/2025, 11:33:40
/*class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        
    }
}*/
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        // Step 1: Sort the envelopes
        Arrays.sort(envelopes, (a, b) -> {
            // Sort by width in ascending order
            // If widths are equal, sort by height in descending order
            return a[0] == b[0] ? b[1] - a[1] : a[0] - b[0];
        });

        // Step 2: Find the Longest Increasing Subsequence (LIS) of heights
        int n = envelopes.length;
        int[] dp = new int[n];
        int length = 0; // The length of the longest subsequence found so far

        for (int[] envelope : envelopes) {
            int height = envelope[1];

            // Use binary search to find the position of 'height' in dp array
            int left = 0, right = length;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (dp[mid] < height) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            // Update dp array with the new height
            dp[left] = height;
            if (left == length) {
                length++; // Increase the length of the LIS if we found a new longest subsequence
            }
        }

        return length;
    }
}
