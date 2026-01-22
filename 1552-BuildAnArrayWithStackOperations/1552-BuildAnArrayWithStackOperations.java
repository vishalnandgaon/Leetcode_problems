// Last updated: 22/01/2026, 12:33:14
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        int j=0;
        for(int i=1;i<=n;i++){
            list.add("Push");
            st.push(i);
            if(st.peek()==target[target.length-1]){
                break;
            }
            if(st.peek()!=target[j]){
                list.add("Pop");
                st.pop();
            }
            else{
                j++;
            }
        }
        return list;
    }
}