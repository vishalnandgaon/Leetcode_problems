// Last updated: 05/04/2026, 21:35:11
class Solution {

    private boolean isAlpha(char c){
        return "abcdefghijklmnopqrstuvwxyz".indexOf(c)!=-1;
    }
    public int mirrorFrequency(String s) {
        int[] f1=new int[26];
        int[] f2=new int[10];

        for(int i=0;i<s.length();i++){
            if(isAlpha(s.charAt(i))){
                f1[25-(s.charAt(i)-'a')]++;
            }
            else{
                f2[9-(s.charAt(i)-'0')]++;
            }
        }
        int ans=0;
        int left=0;
        int right=25;
        while(left<right){
            if(f1[left]!=f1[right]){
                ans+=Math.abs(f1[left]-f1[right]);
            }
            left++;
            right--;
        }

        left=0;
        right=9;
        while(left<right){
            if(f2[left]!=f2[right]){
                ans+=Math.abs(f2[left]-f2[right]);
            }
            left++;
            right--;
        }
        return ans;
    }
}