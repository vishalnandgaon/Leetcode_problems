// Last updated: 01/10/2025, 17:48:12
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