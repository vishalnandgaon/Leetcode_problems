// Last updated: 09/09/2026, 16:32:05
class Solution {
    private int solve(int start,int end,int[] nums){
        int prev2=0;
        int prev1=0;
        for(int i=start;i<=end;i++){
            int pick=nums[i]+prev2;
            int nopick=prev1;
            int loot=Math.max(pick,nopick);
            prev2=prev1;
            prev1=loot;
        }
        return prev1;
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        else if(n==2) return Math.max(nums[0],nums[1]);
        int first_include=solve(0,n-2,nums);
        int last_include=solve(1,n-1,nums);
        return Math.max(first_include,last_include);
    }
}