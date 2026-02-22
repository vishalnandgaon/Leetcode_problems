// Last updated: 22/02/2026, 21:00:49
class Solution {
    public String maximumXor(String s, String t) {
        int n=s.length();
        int s0=0,s1=0;
        int t0=0,t1=0;
        for(char c:t.toCharArray()){
            if(c=='0') t0++;
            else t1++;
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                if(t1>0){
                    result.append('1');
                    t1--;
                }
                else{
                    result.append('0');
                    t0--;
                }
            }
            else{
                if(t0>0){
                    result.append('1');
                    t0--;
                }
                else{
                    result.append('0');
                    t1--;
                }
            }
        }
        return result.toString();
    }
}