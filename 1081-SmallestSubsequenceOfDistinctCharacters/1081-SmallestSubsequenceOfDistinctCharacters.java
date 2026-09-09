// Last updated: 09/09/2026, 16:21:27
class Solution {
    public String smallestSubsequence(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        boolean[] seen=new boolean[26];
        int[] freq=new int[26];

        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }

        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            freq[c-'a']--;
            if(seen[c-'a']) continue;
            while(!st.isEmpty() && st.peek()>c && freq[st.peek()-'a']>0){
                seen[st.peek()-'a']=false;
                st.pop();
            }
            st.push(c);
            seen[c-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}