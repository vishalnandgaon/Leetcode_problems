// Last updated: 09/09/2026, 16:28:06
class Solution {
    public int change(int amount,int[]coins) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans=solve(coins,amount,0,dp);
        return ans;
    }
    private int solve(int[] coins,int amount,int i,int[][] dp){
            if(i==coins.length-1){
                if(amount%coins[i]==0){
                    return 1;
                }
                return 0;
            }
            if(dp[i][amount]!=-1){
                return dp[i][amount];
            }

            int notake=solve(coins,amount,i+1,dp);
            int take=0;
            if(coins[i]<=amount){
                take=solve(coins,amount-coins[i],i,dp);
            }

            return dp[i][amount]=take+notake;
        }
}