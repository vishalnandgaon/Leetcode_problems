// Last updated: 14/09/2025, 21:36:24
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        String a="--X";
        String b="++X";
        String c="X--";
        String d="X++";
        for(String s:operations){
            if(s.equals(a) || s.equals(c)) ans--;
            else ans++;
        }
        return ans;
    }
}