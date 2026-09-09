// Last updated: 09/09/2026, 16:17:52
class Solution {
    public int[] runningSum(int[] nums) {
        int add=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i]=add+nums[i];
            add=nums[i];
        }
        return nums;
    }
}