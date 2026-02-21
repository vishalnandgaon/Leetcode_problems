// Last updated: 21/02/2026, 22:38:32
class Solution {
    public boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int bits=Integer.bitCount(i);
            if(isPrime(bits)){
                count++;
            }
        }
        return count;
    }
}