// Last updated: 09/09/2026, 16:30:58
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++) xor^=nums[i];

        int diff=xor & (-xor);

        int a=0,b=0;
        for(int x:nums){
            if((x & diff) !=0) a^=x;
            else b^=x;
        }
        return new int[]{a,b};
    }
}