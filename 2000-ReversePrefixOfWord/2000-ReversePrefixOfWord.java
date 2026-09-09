// Last updated: 09/09/2026, 16:12:34
class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder st=new StringBuilder();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                st.append(word.substring(0,i+1));
                st.reverse();
                st.append(word.substring(i+1));
                return st.toString();
            }
        }
        return word;
    }
}