// Last updated: 09/09/2026, 16:15:44
class Solution {
    public int minPartitions(String n) {
        int ans=0;
        for(char c:n.toCharArray()){
            int digit=c-'0';
            if(digit>ans){
                ans=digit;
            }
        }
        return ans;
    }
}