// Last updated: 09/09/2026, 16:16:05
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set=new HashSet<>();
        for(char ch:allowed.toCharArray()){
            set.add(ch);
        }
        int ans=words.length;
        for(int i=0;i<words.length;i++){
            for(char ch:words[i].toCharArray()){
                if(!set.contains(ch)){
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}