// Last updated: 09/09/2026, 16:06:41
class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int minlen=Math.min(s1.length(),Math.min(s2.length(),s3.length()));

        int count=0;
        for(int i=0;i<minlen;i++){
            if(s1.charAt(i)==s2.charAt(i) && s2.charAt(i)==s3.charAt(i)){
                count++;
            }
            else{
                break;
            }
        }
        if(count==0) return -1;
        return s1.length()+s2.length()+s3.length()-3*count;
    }
}