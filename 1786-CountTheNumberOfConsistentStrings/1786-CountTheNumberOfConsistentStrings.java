// Last updated: 14/09/2025, 21:36:41
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