// Last updated: 23/09/2025, 18:12:12
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