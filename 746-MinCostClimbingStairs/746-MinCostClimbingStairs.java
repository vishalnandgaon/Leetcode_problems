// Last updated: 09/09/2026, 16:26:00
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==1) return cost[0];
        if(cost.length==2) return Math.min(cost[0],cost[1]);
        int[] dp=new int[cost.length];
        Arrays.fill(dp,-1);
        int one=solve(cost,0,dp);
        int two=solve(cost,1,dp);
        return Math.min(one,two);
    }
    private int solve(int[] cost,int i,int[] dp){
        if(i>=cost.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int pickone=cost[i]+solve(cost,i+1,dp);
        int picktwo=cost[i]+solve(cost,i+2,dp);
        dp[i]=Math.min(pickone,picktwo);
        return dp[i];
    }
}