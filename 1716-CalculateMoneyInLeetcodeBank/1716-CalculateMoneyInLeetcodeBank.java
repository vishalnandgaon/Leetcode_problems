// Last updated: 09/09/2026, 16:15:32
class Solution {
    public int totalMoney(int n) {
        int week = n / 7;
        int days = n % 7;

        int ans = 0;

        // Sum of full weeks
        if(week > 0) {
            ans += week * 28 + (week * (week - 1) / 2) * 7;
        }

        // Sum of remaining days
        int start = week + 1;
        for(int i = 0; i < days; i++) {
            ans += start + i;
        }

        return ans;
    }
}
