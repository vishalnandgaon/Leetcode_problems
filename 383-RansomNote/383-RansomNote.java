// Last updated: 09/09/2026, 16:29:54
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Ab hum optimal approach likhenge baccha
        int[] freq=new int[26];
        for(int i=0;i<magazine.length();i++){
            freq[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(freq[ransomNote.charAt(i)-'a']==0) return false;
            freq[ransomNote.charAt(i)-'a']--;
        }
        return true;
    }
}