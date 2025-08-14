// Last updated: 14/08/2025, 11:34:53
class Solution {
    public double myPow(double x, int n) {
        long exp=n;
        
        if(n==0){
            return 1;
        }
        if(exp<0){
            x=1/x;
            exp=-exp;
        }
        double result=1.0;
        while(exp>0){
            if((exp & 1)==1){
                result*=x;
            }
            x*=x;
            exp>>=1;
        }
        return result; 
    }
}