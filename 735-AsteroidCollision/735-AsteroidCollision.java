// Last updated: 26/10/2025, 18:00:29
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int ast:asteroids){
            if(!st.isEmpty() && ast<0 && st.peek()<0){
                st.push(ast);
            }
            else if(!st.isEmpty() && ast>=0 && st.peek()>=0){
                st.push(ast);
            }
            else if(!st.isEmpty() && ast<0 && st.peek()>=0){
                while(!st.isEmpty() && st.peek()>=0 && Math.abs(ast)>st.peek()){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()>Math.abs(ast)){
                    continue;
                }
                else if(!st.isEmpty() && st.peek()==Math.abs(ast)){
                    st.pop();
                    continue;
                }
                st.push(ast);
            }
            else{
                st.push(ast);
            }
            
        }
        int[] ans=new int[st.size()];
        int i=st.size()-1;
        while(!st.isEmpty()){
            ans[i]=st.pop();
            i--;
        }
        return ans;
    }
}