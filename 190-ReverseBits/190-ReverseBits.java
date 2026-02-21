// Last updated: 21/02/2026, 22:39:46
class Solution {
    public int reverseBits(int n) {
        int result=0;
        for(int i=0;i<32;i++){
            result<<=1;
            result|=(n & 1);
            n>>>=1;
        }
        return result;
    }
}