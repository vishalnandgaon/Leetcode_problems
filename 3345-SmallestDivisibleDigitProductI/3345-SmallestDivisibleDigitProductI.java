// Last updated: 09/09/2026, 16:02:55
class Solution {
    public int smallestNumber(int n, int t) {
        int a=n;
        int answer=prod(a);
        while(answer%t!=0){
            answer=prod(++a);
        }
        return a;
    }
    private int prod(int x){
        int ans=1;
        while(x!=0){
            int rem=x%10;
            ans*=rem;
            x/=10;
        }
        return ans;
    }
}