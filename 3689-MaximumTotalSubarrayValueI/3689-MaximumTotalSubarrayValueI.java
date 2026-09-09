// Last updated: 09/09/2026, 15:58:07
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n=nums.length;
        if(n==0 || n==1) return 0;
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        return (max-min)*k;
    }
}