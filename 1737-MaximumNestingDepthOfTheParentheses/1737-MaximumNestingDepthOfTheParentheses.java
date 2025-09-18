// Last updated: 18/09/2025, 12:10:09
class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack=new Stack<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
                max=Math.max(max,stack.size());

            }
            if(s.charAt(i)==')' && !stack.isEmpty()){
                stack.pop();
            }
        }  
        return max; 
    }
}