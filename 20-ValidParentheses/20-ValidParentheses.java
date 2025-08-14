// Last updated: 14/08/2025, 11:35:27
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if((ch==')' || ch==']' || ch=='}') && st.size()==0) return false;
            else if(ch=='(' || ch=='[' || ch=='{')st.push(ch);
            else if((ch==')' && st.peek()=='(') || (ch==']' && st.peek()=='[') || (ch=='}' && st.peek()=='{')){
                st.pop();
            }
            else return false;
        }
        if(st.size()==0)return true;
        else return false;
    }
}