// Last updated: 07/09/2025, 12:29:08
class Solution {
    public int minOperations(int[] nums) {
        int target=nums[0];
        boolean all=true;
        for(int num:nums){
            target &=num;
            if(num!=nums[0]){
                all=false;
            }
        }
        if(all) return 0;
        int whole=nums[0];
        for(int i=1;i<nums.length;i++){
            whole &=nums[i];
        }
        if(whole==target) return 1;
        int a=0;
        int b=~0;
        for(int num:nums){
            b &=num;
            if(b==target){
                a++;
                b=~0;
            }
        }
        return a;
    }
}