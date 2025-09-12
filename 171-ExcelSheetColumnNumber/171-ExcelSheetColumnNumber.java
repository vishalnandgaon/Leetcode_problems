// Last updated: 12/09/2025, 06:41:33
class Solution {
    public int titleToNumber(String columnTitle) {
        int result=0;
        char[] columns=columnTitle.toCharArray();
        for(char c:columns){
            int val=c-'A' +1;
            result=result*26+val;
        }
        return result;
    }
}