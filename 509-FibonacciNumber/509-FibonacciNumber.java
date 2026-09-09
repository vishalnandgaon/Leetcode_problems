// Last updated: 09/09/2026, 16:22:55
class Solution {
    public int fib(int n) {
        if(n==0 || n==1) return n;
        return fib(n-1)+fib(n-2);
    }
}