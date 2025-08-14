// Last updated: 14/08/2025, 11:33:44
class Solution {
    public void reverseString(char[] s) {
        char[] rev= new char[s.length];
        for(int i=0;i<s.length;i++){
            rev[i]=s[s.length-1-i];
        }
        for(int i=0;i<s.length;i++){
            s[i]=rev[i];
        }

    }
}