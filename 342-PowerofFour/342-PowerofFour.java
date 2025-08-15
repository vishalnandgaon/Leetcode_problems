// Last updated: 15/08/2025, 06:59:51
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n==0 || n%4!=0) return false;
     return isPowerOfFour(n/4);
    }
}