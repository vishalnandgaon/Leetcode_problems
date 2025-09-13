// Last updated: 13/09/2025, 22:25:49
class Solution {
    public boolean isvowel(char ch){
        return "aeiou".indexOf(ch)!=-1;
    }
    public int maxFreqSum(String s) {
        int[] arr=new int[26];

        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        int maxvowel=0;
        int maxconstant=0;
        for(int i=0;i<26;i++){
            int freq=arr[i];
            if(freq==0) continue;
            char alpha=(char)(i+'a');
            if(isvowel(alpha)){
                if(freq>maxvowel){
                    maxvowel=freq;
                }
            }
            else{
                if(freq>maxconstant){
                    maxconstant=freq;
                }
            }

        }
        return maxvowel+maxconstant;
    }
}