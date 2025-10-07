// Last updated: 07/10/2025, 23:45:30
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n/2;i++){
            maxsum=Math.max(maxsum,nums[i]+nums[n-1-i]);
        }
        return maxsum;
    }
}