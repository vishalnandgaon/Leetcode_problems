// Last updated: 14/09/2025, 21:35:51
class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int idx=26-(s.charAt(i)-'a');
            ans+=(i+1)*idx;
        }
        return ans;
    }
}