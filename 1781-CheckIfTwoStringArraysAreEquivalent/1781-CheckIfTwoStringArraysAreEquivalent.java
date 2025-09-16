// Last updated: 16/09/2025, 18:01:20
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder st=new StringBuilder();
        StringBuilder bt=new StringBuilder();
        for(int i=0;i<word1.length;i++){
            st.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            bt.append(word2[i]);
        }
        return st.toString().equals(bt.toString());
    }
}