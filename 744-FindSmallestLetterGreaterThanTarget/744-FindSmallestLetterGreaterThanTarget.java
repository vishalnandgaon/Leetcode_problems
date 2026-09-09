// Last updated: 09/09/2026, 16:26:05
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans=letters[0];
        int n=letters.length;
        for(int i=0;i<n;i++){
            if(letters[i]>target){
                ans=letters[i];
                break;
            }
        }
        return ans;
    }
}