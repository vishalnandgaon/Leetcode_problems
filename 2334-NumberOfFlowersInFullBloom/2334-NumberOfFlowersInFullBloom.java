// Last updated: 07/10/2025, 23:45:18
class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n = flowers.length, m = people.length;
        int[] start = new int[n], end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            int t = people[i];
            int started = upperBound(start, t);     // start ≤ t
            int ended = lowerBound(end, t);         // end < t
            ans[i] = started - ended;
        }
        return ans;
    }

    // first index > target
    private int upperBound(int[] arr, int x) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if (arr[mid] <= x) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    // first index ≥ target
    private int lowerBound(int[] arr, int x) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if (arr[mid] < x) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}
