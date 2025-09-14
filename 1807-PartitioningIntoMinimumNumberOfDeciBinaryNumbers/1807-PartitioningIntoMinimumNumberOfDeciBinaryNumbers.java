// Last updated: 14/09/2025, 21:36:36
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