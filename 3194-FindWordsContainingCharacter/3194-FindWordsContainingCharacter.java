// Last updated: 13/09/2025, 22:26:07
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