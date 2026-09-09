// Last updated: 09/09/2026, 16:34:33
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        Integer[][][] dp=new Integer[2][n][3];
        return solve(1,0,2,prices,dp);
    }
    private int solve(int flag,int i,int trans,int[] prices,Integer[][][] dp){
        if(i==prices.length || trans==0){
            return 0;
        }

        if(dp[flag][i][trans]!=null){
            return dp[flag][i][trans];
        }
        int profit=0;
        if(flag==1){
            int buy=-prices[i]+solve(0,i+1,trans,prices,dp);
            int skip=solve(1,i+1,trans,prices,dp);
            profit=Math.max(buy,skip);
        }
        else{
            int sell=prices[i]+solve(1,i+1,trans-1,prices,dp);
            int chodo=solve(0,i+1,trans,prices,dp);
            profit=Math.max(sell,chodo);
        }

        return dp[flag][i][trans]=profit;
    }
}