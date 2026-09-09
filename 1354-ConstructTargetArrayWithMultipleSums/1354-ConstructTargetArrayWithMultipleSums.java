// Last updated: 09/09/2026, 16:18:59
import java.util.*;

class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        long totalSum = 0;

        for (int num : target) {
            maxHeap.add((long) num);
            totalSum += num;
        }

        while (true) {
            long max = maxHeap.poll();
            long restSum = totalSum - max;

            // Base cases
            if (max == 1 || restSum == 1) return true;
            if (restSum == 0 || max < restSum) return false;

            long prev = max % restSum;

            if (prev == 0) return false;

            // Update
            totalSum = restSum + prev;
            maxHeap.add(prev);
        }
    }
}