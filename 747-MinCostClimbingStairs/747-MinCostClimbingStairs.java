// Last updated: 10/09/2025, 12:31:47
class Solution {
    public int mincost(int[] cost,int stair,int[] dp){
        if(stair>=cost.length) return 0;
        if(dp[stair]!=-1) return dp[stair];
        int takeone=cost[stair]+mincost(cost,stair+1,dp);
        int taketwo=cost[stair]+mincost(cost,stair+2,dp);
        return dp[stair]=Math.min(takeone,taketwo);
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(mincost(cost,0,dp),mincost(cost,1,dp));
    }
}