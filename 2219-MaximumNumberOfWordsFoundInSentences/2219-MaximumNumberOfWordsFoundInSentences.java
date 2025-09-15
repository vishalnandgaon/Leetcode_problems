// Last updated: 15/09/2025, 18:13:06
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