// Last updated: 09/09/2026, 16:20:46
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr=text.split(" ");
        Set<Character> st=new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++){
            st.add(brokenLetters.charAt(i));
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(char ch:arr[i].toCharArray()){
                if(st.contains(ch)){
                    ans--;
                    break;
                }              
                }
                ans++;
            }
        return ans;
    }
}