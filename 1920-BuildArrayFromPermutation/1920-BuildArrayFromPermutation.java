// Last updated: 09/09/2026, 16:13:22
class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=nums[nums[i]];
        } 
        return ans;
    }
}