// Last updated: 02/10/2025, 10:55:28
class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int ans=0;
        int maxcount=0;
        int n=s.length();
        int[] arr=new int[26];
        for(int right=0;right<n;right++){
            char c=s.charAt(right);
            arr[c-'A']++;
            maxcount=Math.max(maxcount,arr[c-'A']);
            while(((right-left+1)-maxcount)>k){
                arr[s.charAt(left)-'A']--;
                left++;
            }
            ans= Math.max(ans,right-left+1);
        }
        return ans;
    }
}