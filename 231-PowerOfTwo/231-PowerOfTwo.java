// Last updated: 14/08/2025, 11:33:57
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if(n==0) return false;
        if(n%2!=0)return false;
        return isPowerOfTwo(n/2);
    }
}