// Last updated: 09/09/2026, 16:06:43
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(char ch:words[i].toCharArray()){
                if(ch-x==0){
                    ans.add(i);
                    break;
                    
                }
            }   
        }
        return ans;
    }
}