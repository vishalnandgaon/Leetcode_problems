// Last updated: 20/04/2026, 12:36:08
class Solution {
    public int mirrorDistance(int n) {
        int rev=reverse(n);
        return Math.abs(n-rev);
    }
    private int reverse(int n){
        int ans=0;
        while(n>0){
            ans=ans*10+n%10;
            n/=10;
        }
        return ans;
    }
}