// Last updated: 23/09/2025, 18:11:53
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