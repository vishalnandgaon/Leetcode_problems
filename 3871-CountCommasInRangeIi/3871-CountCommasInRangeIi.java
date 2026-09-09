// Last updated: 09/09/2026, 15:56:00
class Solution {
    public long countCommas(long n) {
        long ans=0;
        long thres=1000;
        while(n>=thres){
            ans+=(n-thres+1);
            if(thres>Long.MAX_VALUE/1000) break;
            thres*=1000;
        }
        return ans;
    }
}