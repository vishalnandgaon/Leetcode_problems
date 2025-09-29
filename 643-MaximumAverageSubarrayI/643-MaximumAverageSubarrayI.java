// Last updated: 29/09/2025, 22:51:05
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxsum=sum;
        int j=0;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[j]+nums[i];
            maxsum=Math.max(maxsum,sum);
            j++;
        }
        return (double)maxsum/k;
    }
}