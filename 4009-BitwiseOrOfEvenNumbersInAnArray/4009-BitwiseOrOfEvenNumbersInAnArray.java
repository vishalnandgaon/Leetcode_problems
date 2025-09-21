// Last updated: 21/09/2025, 15:15:59
class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans=(ans | nums[i]);
            }
        }
        return ans;
    }
}