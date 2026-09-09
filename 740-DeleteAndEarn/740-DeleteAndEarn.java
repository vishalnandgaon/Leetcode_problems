// Last updated: 09/09/2026, 16:26:13
class Solution {
    // YE HAI BHAI HOUSE ROBBER KA VARIANT
    public int deleteAndEarn(int[] nums) {
        int max=0;
        for(int num:nums){
            max=Math.max(max,num);
        }
        int[] values=new int[max+1];
        for(int num:nums){
            values[num]+=num;
        }

        int prev2=0;
        int prev1=0;
        for(int points:values){
            int pick=points+prev2;
            int nopick=prev1;
            int curr=Math.max(pick,nopick);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}