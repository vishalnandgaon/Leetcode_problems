// Last updated: 01/09/2025, 21:18:42
class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        int[] primes={2,3,5};
        for(int p:primes){
            while(n%p==0){
                n=n/p;
            }
        }
        return n==1;
    }
}