// Last updated: 09/09/2026, 15:57:45
class Solution {
    public int minCost(int n) {
        if(n==1) return 0;
        int cost=0;
        cost= (n*(n-1))/2;
        return cost;
    }
}