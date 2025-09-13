// Last updated: 13/09/2025, 22:26:01
class Solution {
    public int scoreOfString(String s) {
        int score=0;
        char[] ch=s.toCharArray();
        for(int i=1;i<ch.length;i++){
            score+=Math.abs((ch[i]-'a')-(ch[i-1]-'a'));
        }
        return score;
    }
}