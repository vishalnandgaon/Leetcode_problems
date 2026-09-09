// Last updated: 09/09/2026, 16:11:57
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int ans=0;
        int target=tickets[k];

        for(int i=0;i<tickets.length;i++){
            if(i<=k){
                ans+=Math.min(tickets[i],target);
            }
            else{
                ans+=Math.min(tickets[i],target-1);
            }
        }
        return ans;
    }
}