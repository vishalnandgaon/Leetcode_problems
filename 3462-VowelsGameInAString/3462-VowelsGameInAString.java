// Last updated: 13/09/2025, 22:25:56
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