// Last updated: 09/09/2026, 15:55:10
class Solution {
    public boolean validDigit(int n, int x) {
        String s=String.valueOf(n);
        char ch=(char)(x+'0');
        boolean contains=s.indexOf(ch)!=-1;
        boolean nots=s.charAt(0)!=ch;
        return contains && nots;
    }
}