// Last updated: 26/03/2026, 22:58:14
import java.util.*;

class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length, n = grid[0].length, index = 0;
        int[] arr = new int[m * n];
        
        for (int[] row : grid) {
            for (int j = 0; j < n; j++) {
                arr[index++] = row[j];
            }
        }
        if (canPartitionArray(arr, m, n)) {
            return true;
        }

        index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[index++] = grid[j][i];
            }
        }
        if (canPartitionArray(arr, n, m)) {
            return true;
        }
        return false;
    }

    private boolean canPartitionArray(int[] arr, int m, int n) {
        int index = 0;
        long sum = 0, sum1 = 0, sum2, diff;
        Map<Long, Integer> firstOccurrence = new HashMap<>();
        Map<Long, Integer> lastOccurrence = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            firstOccurrence.putIfAbsent((long) arr[i], i);
            sum += arr[i];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            lastOccurrence.putIfAbsent((long) arr[i], i);
        }

        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                sum1 += arr[index++];
            }
            sum2 = sum - sum1;

            if (sum1 == sum2) {
                return true;
            } else if (sum1 > sum2) {
                diff = sum1 - sum2;

                if ((i == 0 && (arr[0] == diff || arr[n - 1] == diff))
                    || (n == 1 && (arr[0] == diff || arr[index - 1] == diff))) {
                    return true;
                }

                if (firstOccurrence.containsKey(diff)) {
                    int pos = firstOccurrence.get(diff);
                    if (pos < index && i > 0 && n > 1) {
                        return true;
                    }
                }
            } else {
                diff = sum2 - sum1;

                if (lastOccurrence.containsKey(diff)) {
                    int pos = lastOccurrence.get(diff);

                    if ((i == m - 2 && (arr[n * (m - 1)] == diff || arr[n * m - 1] == diff))
                        || (n == 1 && (arr[index] == diff || arr[m * n - 1] == diff))) {
                        return true;
                    }

                    if (pos >= index && i < m - 2 && n > 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}