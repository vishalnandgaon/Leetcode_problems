// Last updated: 09/09/2026, 16:10:32
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