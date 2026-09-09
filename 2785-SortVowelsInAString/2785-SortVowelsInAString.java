// Last updated: 09/09/2026, 16:07:22
class Solution {
    public boolean isVowel(char c){
        return "AEIOUaeiou".indexOf(c) !=-1;
    }
    public String sortVowels(String s) {
        List<Character> vowels=new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(isVowel(ch)) vowels.add(ch);
        }
        Collections.sort(vowels);

        StringBuilder st=new StringBuilder();
        int idx=0;
        for(char ch:s.toCharArray()){
            if(isVowel(ch)) st.append(vowels.get(idx++));
            else{
                st.append(ch);
            }
        }
        return st.toString();
    }
}