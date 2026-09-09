// Last updated: 09/09/2026, 16:05:05
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