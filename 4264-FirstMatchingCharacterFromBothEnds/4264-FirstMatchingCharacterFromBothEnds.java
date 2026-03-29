// Last updated: 29/03/2026, 22:44:54
class Solution {
    public int firstMatchingIndex(String s) {
        int n=s.length()-1;
        for(int i=0;i<=n;i++){
            if(s.charAt(i)==s.charAt(n-i)){
                return i;
            }
        }
        return -1;
    }
}