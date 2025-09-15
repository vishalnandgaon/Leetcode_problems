// Last updated: 15/09/2025, 18:13:10
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