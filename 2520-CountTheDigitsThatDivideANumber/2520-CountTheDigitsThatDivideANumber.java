// Last updated: 09/09/2026, 16:08:33
class Solution {
    public int countDigits(int num) {
        int n=num;
        int ans=0;
        while(num!=0){
            int div=num%10;
            if(n%div==0) ans++;
            num/=10;
        }
        return ans;
    }
}