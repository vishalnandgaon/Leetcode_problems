// Last updated: 09/09/2026, 16:24:30
class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {

            int mid = l + (r - l) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // increasing slope
                l = mid + 1;
            } else {
                // decreasing slope or peak
                r = mid;
            }
        }

        return l;
    }
}