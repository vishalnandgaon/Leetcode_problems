// Last updated: 09/09/2026, 16:04:24
class Solution {
    public boolean isvowel(char ch){
        return "aeiou".indexOf(ch)!=-1;
    }
    public boolean doesAliceWin(String s) {
        int count=0;
        for(char ch:s.toCharArray()){
            if(isvowel(ch)) count++;
        }
        if(count==0) return false;
        return true;
    }
}