// Last updated: 01/09/2025, 21:18:34
class Solution {
    public boolean checkPerfectNumber(int num) {
        int n=num/2;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return num==sum;
    }
}