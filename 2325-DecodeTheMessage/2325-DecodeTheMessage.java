// Last updated: 09/09/2026, 16:09:56
class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map=new HashMap<>();
        String res=key.replace(" ","");
        char nextchar='a';
        for(int i=0;i<res.length();i++){
            if(map.containsKey(res.charAt(i))) continue;
            map.put(res.charAt(i),nextchar++);
        }
        StringBuilder st=new StringBuilder();
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' ') st.append(" ");
            else st.append(map.get(message.charAt(i)));
        }
        return st.toString();
    }
}