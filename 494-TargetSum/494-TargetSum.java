// Last updated: 09/09/2026, 16:28:24
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=nums[i];
        }
        if(Math.abs(target)>totalSum) return 0;
        if((target+totalSum)%2!=0) return 0;
        int k=(target+totalSum)/2;
        int[][]dp=new int[n][k+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(nums,k,0,dp);

    }

    private int solve(int[]nums,int k,int i,int[][] dp){
        if(i==nums.length-1){
            if(nums[i]==0 && k==0){
                return 2;
            }
            if(k==0 || nums[nums.length-1]==k){
                return 1;
            }
            return 0;
        }
        if(dp[i][k]!=-1){
            return dp[i][k];
        }
        int notake=solve(nums,k,i+1,dp);
        int take=0;
        if(nums[i]<=k){
            take=solve(nums,k-nums[i],i+1,dp);
        }

        return dp[i][k]=take+notake;
    }
}