// Last updated: 11/10/2025, 23:36:38
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int minimum=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                minimum=Math.min(minimum,right-left+1);
                sum-=nums[left];
                left++;

            }
        }
        return (minimum==Integer.MAX_VALUE) ? 0:minimum;
    }
}