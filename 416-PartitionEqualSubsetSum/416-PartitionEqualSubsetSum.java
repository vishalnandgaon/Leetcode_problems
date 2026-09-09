// Last updated: 09/09/2026, 16:29:17
class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        int target=sum/2;
        Boolean[][] dp=new Boolean[n][target+1];
        return solve(nums,target,n-1,dp);
    }

    private boolean solve(int[] nums,int target,int i,Boolean[][] dp){
        if(target==0){
            return true;
        }
        if(i==0){
            return target==nums[i];
        }
        if(dp[i][target]!=null){
            return dp[i][target];
        }
        boolean notake=solve(nums,target,i-1,dp);
        boolean take=false;
        if(nums[i]<=target){
            take=solve(nums,target-nums[i],i-1,dp);
        }

        return dp[i][target]= take || notake;
    }
}