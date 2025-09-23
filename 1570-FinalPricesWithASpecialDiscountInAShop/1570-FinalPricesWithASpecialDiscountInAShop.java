// Last updated: 23/09/2025, 18:12:16
class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    prices[i]=prices[i]-prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}