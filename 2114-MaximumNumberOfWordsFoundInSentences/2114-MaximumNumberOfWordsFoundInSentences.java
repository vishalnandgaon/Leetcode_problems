// Last updated: 09/09/2026, 16:11:36
class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(int i=0;i<sentences.length;i++){
            String[] temp=sentences[i].split(" ");
            ans=Math.max(ans,temp.length);
        }
        return ans;
    }
}