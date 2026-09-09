// Last updated: 09/09/2026, 16:14:27
class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26){
            return false;
        }
        String str = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < 26; i++){
            char ch = str.charAt(i);
            if(sentence.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }
}