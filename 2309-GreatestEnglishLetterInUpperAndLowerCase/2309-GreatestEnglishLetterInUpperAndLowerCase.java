// Last updated: 09/09/2026, 16:20:00
class Solution {
    public String greatestLetter(String s) {
        boolean[] low=new boolean[26];
        boolean[] high=new boolean[26];

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                low[s.charAt(i)-'a']=true;
            }
            else{
                high[s.charAt(i)-'A']=true;
            }
        }
        String ans="";
        // char an='A'+25;
        // System.out.println(an);
        for(int i=25;i>=0;i--){
            if(low[i] && high[i]){
                char an=(char) ('A'+ i);
                ans=""+an;
                break;
            }
        }
        return ans;
    }
}