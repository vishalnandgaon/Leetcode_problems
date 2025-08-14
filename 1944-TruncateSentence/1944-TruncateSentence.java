// Last updated: 14/08/2025, 12:30:09
class Solution {
    public String truncateSentence(String s, int k) {
        String str[]=s.split(" ");
        StringBuilder st=new StringBuilder();
        for(int i=0;i<k;i++){
            st.append(str[i]+" ");
        }
        String ans=st.toString();
        String an=ans.trim();
        return an;
    }
}