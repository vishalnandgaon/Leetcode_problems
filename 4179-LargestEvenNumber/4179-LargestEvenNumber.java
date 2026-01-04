// Last updated: 04/01/2026, 23:49:23
class Solution {
    public String largestEven(String s) {
        int n=s.length()-1;
        int k=-1;
        for(int i=n;i>=0;i--){
            if((s.charAt(i) -'0')%2!=0){
                continue;
            }
            else{
                k=i;
                break;
            }
        }
        return s.substring(0,k+1);
    }
}