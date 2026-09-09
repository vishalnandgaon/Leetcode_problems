// Last updated: 09/09/2026, 16:04:45
class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] low=new boolean[26];
        boolean[] up=new boolean[26];

        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);

            // lowercase hai koee 
            if(c>='a' && c<='z'){
                low[c-'a']=true;
            }

            // uppar case letter hai
            else{
                up[c-'A']=true;
            }
        }

        int count=0;
        for(int i=0;i<26;i++){
            if(up[i] && low[i]) count++;
        }
        return count;
    }
}