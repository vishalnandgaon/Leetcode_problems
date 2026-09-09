// Last updated: 09/09/2026, 16:05:25
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans=numBottles;
        int vacant=numBottles;
        while(vacant>=numExchange){
            int multi=vacant/numExchange;
            int rem=vacant%numExchange;
            ans++;
            vacant=(multi-1)*numExchange+rem+1;
            numExchange++;

        }
        return ans;
    }
}