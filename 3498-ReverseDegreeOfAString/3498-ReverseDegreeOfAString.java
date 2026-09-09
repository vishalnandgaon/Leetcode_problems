// Last updated: 09/09/2026, 16:01:16
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