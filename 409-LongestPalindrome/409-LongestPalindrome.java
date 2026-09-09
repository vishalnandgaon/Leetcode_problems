// Last updated: 09/09/2026, 16:29:28
class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
            }
            else{
                set.add(s.charAt(i));
            }
        }
        if(set.size()==1 || set.size()==0) return n;
        return n-set.size()+1;
    }
}