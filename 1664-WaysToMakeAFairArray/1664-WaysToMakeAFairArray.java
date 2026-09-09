// Last updated: 09/09/2026, 16:16:10
class Solution {
    public int waysToMakeFair(int[] nums) {

        int totalEven = 0;
        int totalOdd = 0;

        int n = nums.length;

        // total sums
        for(int i = 0; i < n; i++) {

            if(i % 2 == 0)
                totalEven += nums[i];
            else
                totalOdd += nums[i];
        }

        int leftEven = 0;
        int leftOdd = 0;

        int count = 0;

        for(int i = 0; i < n; i++) {

            if(i % 2 == 0)
                totalEven -= nums[i];
            else
                totalOdd -= nums[i];

            int newEven = leftEven + totalOdd;
            int newOdd = leftOdd + totalEven;

            if(newEven == newOdd)
                count++;

            if(i % 2 == 0)
                leftEven += nums[i];
            else
                leftOdd += nums[i];
        }

        return count;
    }
}