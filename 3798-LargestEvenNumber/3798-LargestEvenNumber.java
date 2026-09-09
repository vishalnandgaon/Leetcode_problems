// Last updated: 09/09/2026, 15:56:33
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