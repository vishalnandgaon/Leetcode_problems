// Last updated: 06/10/2025, 23:23:41
class Solution {
    public long minimumTime(int[] time, int totaltrips) {
        Arrays.sort(time);
        long left = 1;
        long right = (long) totaltrips * time[0]; // cast to long
        long minimum = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long trips = 0;

            for (int i = 0; i < time.length; i++) {
                trips += mid / time[i];
                if (trips >= totaltrips) break; // stop early
            }

            if (trips >= totaltrips) {
                minimum = mid;    // store feasible answer
                right = mid - 1;  // try smaller
            } else {
                left = mid + 1;   // need more time
            }
        }

        return minimum; // smallest feasible time
    }
}
