// Last updated: 01/03/2026, 21:17:30
class Solution {
    public int minCost(int n) {
        if(n==1) return 0;
        int cost=0;
        cost= (n*(n-1))/2;
        return cost;
    }
}