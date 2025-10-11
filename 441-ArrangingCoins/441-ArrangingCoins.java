// Last updated: 11/10/2025, 23:35:38
class Solution {
    public int arrangeCoins(int n) {
        int count=0;
        int i=1;
        while(n>0){
            n=n-i;
            count++;
            i++;
        }
        if(n<0) return count-1;
        return count;
    }
}