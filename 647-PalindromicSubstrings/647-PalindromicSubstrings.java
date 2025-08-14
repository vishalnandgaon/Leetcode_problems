// Last updated: 14/08/2025, 11:33:38
class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<=s.length()-1;i++){
            for(int j=i+1;j<=s.length();j++){
                String gtr=s.substring(i,j);
                String str=new StringBuilder(gtr).reverse().toString();
                if(gtr.equals(str)){
                    count++;
                }

            }
        }
        return count;
    }
}