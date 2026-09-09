// Last updated: 09/09/2026, 16:28:48
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String s1=s+s;
        if(s1.substring(1,s1.length()-1).contains(s)){
            return true;
        }
        return false;
    }
}