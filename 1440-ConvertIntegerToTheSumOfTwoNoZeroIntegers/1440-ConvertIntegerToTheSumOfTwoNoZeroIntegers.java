// Last updated: 08/09/2025, 12:30:33
class Solution {
    public boolean isContainsZero(int num){
        while(num>0){
            if(num%10==0){
                return true;
            }
            num/=10;
        }
        return false;
    }
    public int[] getNoZeroIntegers(int n) {
        int[] ans=new int[2];
        for(int i=1;i<n;i++){
            if(!isContainsZero(i) && !isContainsZero(n-i)){
                ans[0]=i;
                ans[1]=n-i;
                break;
            }
        }
        return ans;
    }
}