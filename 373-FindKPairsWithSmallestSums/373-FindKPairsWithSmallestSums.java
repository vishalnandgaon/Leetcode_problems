// Last updated: 09/09/2026, 16:29:58
import java.util.*;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        List<List<Integer>> result = new ArrayList<>();

        if (nums1.length == 0 || nums2.length == 0) return result;

        // Min Heap: stores {i, j}
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> (nums1[a[0]] + nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]])
        );

        // Step 1: Add first column
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            pq.offer(new int[]{i, 0});
        }

        // Step 2: Extract k pairs
        while (k-- > 0 && !pq.isEmpty()) {

            int[] curr = pq.poll();
            int i = curr[0];
            int j = curr[1];

            result.add(Arrays.asList(nums1[i], nums2[j]));

            // Step 3: Move right
            if (j + 1 < nums2.length) {
                pq.offer(new int[]{i, j + 1});
            }
        }

        return result;
    }
}