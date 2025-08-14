// Last updated: 14/08/2025, 11:34:04
class Solution {
    public int hammingWeight(int n) {
        int count=0;
        int rem=0;
        if(n==0){
            return 0;
        }
        while(n>0){
            rem=n%2;
            n=n/2;
            if(rem==1){
                count++;
            }
        }
        return count;
    }
}