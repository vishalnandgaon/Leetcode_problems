// Last updated: 09/09/2026, 16:23:04
class Solution {
    public int repeatedNTimes(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) return nums[i];
            if((i+2<nums.length) && (nums[i]==nums[i+2])) return nums[i];
            if((i+3<nums.length) && (nums[i]==nums[i+3])) return nums[i];
        }
        return -1;
    }
}