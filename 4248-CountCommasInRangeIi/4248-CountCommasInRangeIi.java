// Last updated: 15/03/2026, 21:24:19
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