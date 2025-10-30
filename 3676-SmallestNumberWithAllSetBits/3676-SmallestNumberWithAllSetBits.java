// Last updated: 30/10/2025, 14:43:15
class Solution {
    public int smallestNumber(int n) {
        if(n<=1) return 1;
        int power=1;
        while(power-1<n){
            power<<=1;
        }
        return power-1;
    }
}