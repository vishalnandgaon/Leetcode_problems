// Last updated: 26/10/2025, 18:01:35
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        boolean[] visited=new boolean[26];
        Stack<Character> st=new Stack<>();

        for(char c:s.toCharArray()){
            freq[c-'a']--;
            if(visited[c-'a']) continue;

            while(!st.isEmpty() && c<st.peek() && freq[st.peek()-'a']>0){
                visited[st.pop()-'a']=false;
            }
            st.push(c);
            visited[c-'a']=true;
        }

        StringBuilder sb=new StringBuilder();
        for(char c:st) sb.append(c);
        return sb.toString();
    }
}