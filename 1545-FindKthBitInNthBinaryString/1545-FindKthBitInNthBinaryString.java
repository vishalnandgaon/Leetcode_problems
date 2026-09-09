// Last updated: 09/09/2026, 16:17:14
class Solution {
    private String inverted(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') sb.append('0');
            else sb.append('1');
        }
        return sb.toString();
    }
    private String solve(int n){
        String s1="0";
        while(n>1){
            String invert=inverted(s1);
            String reversed=new StringBuilder(invert).reverse().toString();
            s1=s1+"1"+ reversed;
            n--;
        }
        return s1;
    }
    public char findKthBit(int n, int k) {
        String ans=solve(n);
        return ans.charAt(k-1);
    }
}