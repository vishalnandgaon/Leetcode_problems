// Last updated: 13/03/2026, 22:52:46
class Solution {
    public int minOperations(String s) {
        int count1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0' && i%2==0){
                count1++;
            }
            else if(s.charAt(i)=='1' && i%2!=0){
                count1++;
            }
        }
        int count2=s.length()-count1;
        return Math.min(count1, count2);
    }
}