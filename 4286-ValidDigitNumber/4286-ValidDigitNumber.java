// Last updated: 25/04/2026, 21:41:14
class Solution {
    public boolean validDigit(int n, int x) {
        String s=String.valueOf(n);
        char ch=(char)(x+'0');
        boolean contains=s.indexOf(ch)!=-1;
        boolean nots=s.charAt(0)!=ch;
        return contains && nots;
    }
}