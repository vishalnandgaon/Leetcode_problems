// Last updated: 09/09/2026, 15:58:17
class Solution {
    public int gcd(int a ,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
            
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int odd_sum=n*n;
        int even_sum=n*(n+1);
        return gcd(odd_sum,even_sum);
    }
}