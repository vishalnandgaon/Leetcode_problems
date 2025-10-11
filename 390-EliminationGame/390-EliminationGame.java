// Last updated: 11/10/2025, 23:35:47
class Solution {
    public int lastRemaining(int n) {
        return calc(n,true);
    }
    private int calc(int n,boolean left){
        if(n==1) return 1;

        if(left){
            return 2*calc(n/2,false);
        }
        else{
            if(n%2==0) return 2*calc(n/2,true)-1;
            else return 2*calc(n/2,true);
        }
    }
}