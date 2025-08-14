// Last updated: 14/08/2025, 11:33:46
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n==0) return false;
        if(n%4!=0) return false;
        return isPowerOfFour(n/4);   
    }
}