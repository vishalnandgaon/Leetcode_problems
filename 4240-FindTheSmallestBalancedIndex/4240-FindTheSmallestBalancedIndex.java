// Last updated: 08/03/2026, 21:32:28
class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n=nums.length;
        if(n==0) return -1;
        long[] leftsum=new long[n];
        long currsum=0;
        for(int i=0;i<n;i++){
            leftsum[i]=currsum;
            currsum+=nums[i];
        }
        long currprod=1;
        long[] rightprod=new long[n];
        long prod=1;
        for(int i=n-1;i>=0;i--){
            rightprod[i]=prod;
            if(prod>2e14){
                prod=(long)2e14;
            }
            else{
                prod*=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(leftsum[i]==rightprod[i]){
                return i;
            }
        }
        return -1;
    }
}