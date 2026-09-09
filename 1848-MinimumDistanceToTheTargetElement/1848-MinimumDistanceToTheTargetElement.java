// Last updated: 09/09/2026, 16:14:05
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int max=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                max=Math.min(max,Math.abs(i-start));
            }
        }
        return max;
    }
}