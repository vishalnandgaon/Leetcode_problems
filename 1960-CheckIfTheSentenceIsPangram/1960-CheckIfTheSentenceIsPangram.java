// Last updated: 16/09/2025, 20:03:53
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