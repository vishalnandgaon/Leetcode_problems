// Last updated: 11/10/2025, 23:36:31
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] arr=s.toCharArray();
        char[] brr=t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=brr[i]) return false;
        }
        return true;
    }
}