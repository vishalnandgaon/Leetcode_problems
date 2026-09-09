// Last updated: 09/09/2026, 16:17:31
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        int vacantbottle=numBottles;
        while(vacantbottle>=numExchange){
            ans+=vacantbottle/numExchange;
            int rem=vacantbottle%numExchange;
            vacantbottle/=numExchange;
            vacantbottle+=rem;
        }
        return ans;
    }
}