// Last updated: 01/10/2025, 17:48:29
class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        int j=n-1;
        while(j>=0){
            for(int i=0;i<j;i++){
                nums[i]=(nums[i]+nums[i+1])%10;
            }
            j--;
        }
        return nums[0];
    }
}