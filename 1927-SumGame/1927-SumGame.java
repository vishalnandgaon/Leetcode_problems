// Last updated: 09/09/2026, 16:13:28
class Solution {
    public boolean sumGame(String num) {
        int left=0;
        int right=0;
        int diff=0;
        int n=num.length();
        for(int i=0;i<n/2;i++){
            if(num.charAt(i)=='?'){
                left++;
            }
            else{
                diff+=num.charAt(i)-'0';
            }
        }
        for(int i=n/2;i<n;i++){
            if(num.charAt(i)=='?'){
                right++;
            }
            else{
                diff-=num.charAt(i)-'0';
            }
        }

        if (Math.abs(left - right) % 2 == 1)
    return true;

return diff != (right - left) / 2 * 9;
    }
}