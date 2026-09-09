// Last updated: 09/09/2026, 16:24:19
class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int max=0;
        int prev=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(prev!=-1){
                    max=Math.max(max,i-prev);
                }
                prev=i;
            }
        }
        return max;
    }
}