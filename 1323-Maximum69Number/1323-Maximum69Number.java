// Last updated: 09/09/2026, 16:19:20
class Solution {
    public int maximum69Number (int num) {
        String str=String.valueOf(num);
        int length=str.length();
        int[] digits=new int[length];
        for(int i=0;i<length;i++){
            digits[i]=str.charAt(i)-'0';
        }
        for(int i=0;i<length;i++){
            if(digits[i]==6){
                digits[i]=9;
                break;
            }
        }
        int sum=0;
        for(int d:digits){
            sum=sum*10+d;
        }
        return sum;
    }
}