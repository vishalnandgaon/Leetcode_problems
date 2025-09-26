// Last updated: 26/09/2025, 15:39:40
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int buy=prices[0];
        int sell=0;
        for(int i=1;i<prices.length;i++){
            sell=prices[i];
            maxprofit=Math.max(maxprofit,sell-buy);
            buy=Math.min(buy,prices[i]);
        }
        return maxprofit;
    }
}