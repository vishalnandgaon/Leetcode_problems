// Last updated: 14/08/2025, 11:35:34
class Solution {
    public boolean isPalindrome(int x) {
        boolean ans=true;
        int rev=0;
        int original=x;
        if(x<0 || x%10==0 && x!=0){
            ans=false;
        }
        else{
            while(x>0){
                rev=rev*10+x%10;
                x/=10;
            }
            if(rev==original){
                ans=true;
            }
            else{
                ans=false;
            }
        }
        return ans;
    }
}