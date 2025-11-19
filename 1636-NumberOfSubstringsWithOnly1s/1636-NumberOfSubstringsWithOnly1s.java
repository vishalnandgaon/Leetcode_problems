// Last updated: 19/11/2025, 15:41:50
class Solution {
    public int numSub(String s) {
        long count=0;
        long result=0;
        long mod=1000000007;
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                count++;
            }
            else{
                result=(result+(count*(count+1))/2)%mod;
                count=0;
            }
        }
        result=(result+(count*(count+1))/2)%mod;

        return (int) result;
    }
}