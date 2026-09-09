// Last updated: 09/09/2026, 15:59:38
class Solution {
    public boolean checkDivisibility(int n) {
        if(n%(add(n)+mul(n))==0) return true;
        return false;
    }
    private int add(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    private int mul(int n){
        int prod=1;
        while(n!=0){
            if(n%10==0)return 0;
            prod*=n%10;
            n/=10;
        }
        return prod;
    }
}