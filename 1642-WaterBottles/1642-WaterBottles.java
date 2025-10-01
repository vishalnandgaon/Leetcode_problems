// Last updated: 01/10/2025, 17:49:49
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