// Last updated: 11/10/2025, 23:35:46
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        if(s.length()>t.length()) return false;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else if(s.charAt(i)!=t.charAt(j)){
                j++;
            }
        }
        if(j==t.length() && i<s.length()) return false;
        return true;
    }
}