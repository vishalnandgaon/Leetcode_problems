// Last updated: 09/09/2026, 16:12:30
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