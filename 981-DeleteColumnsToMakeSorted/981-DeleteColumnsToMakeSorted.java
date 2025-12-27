// Last updated: 27/12/2025, 22:26:37
class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        int l=strs[0].length();
        for(int i=0;i<l;i++){
            for(int j=0;j<strs.length-1;j++){
                if(strs[j].charAt(i)>strs[j+1].charAt(i)){
                    count++;
                    break;
                }
                }
            }
            return count;
        }
    }