// Last updated: 29/09/2025, 22:50:32
class Solution {
    private int sumOfRow(int[] row){
        int sum=0;
        for(int i=0;i<row.length;i++){
            sum+=row[i];
        }
        return sum;
    }
    public int maximumWealth(int[][] accounts) {
        int maxsum=0;
        for(int j=0;j<accounts.length;j++){
            int temp=sumOfRow(accounts[j]);
            maxsum=Math.max(temp,maxsum);
        }
        return maxsum;
    }
}