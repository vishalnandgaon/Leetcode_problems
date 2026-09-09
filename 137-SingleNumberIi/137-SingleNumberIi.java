// Last updated: 09/09/2026, 16:34:06
class Solution {
    public int singleNumber(int[] nums) {
        // int ones=0,twos=0;
        // for(int i=0;i<nums.length;i++){
        //     ones=(ones^nums[i])&~twos;
        //     twos=(twos^nums[i])&~ones;
        // }
        // return ones;
        int result=0;
        for(int i=0;i<=31;i++){
            int sum=0;
            for(int num:nums){
                if((num & (1<<i)) !=0){
                    sum++;
                }
            }

            if(sum%3!=0){
                result |=(1<<i);
            }
        }
        return result;
    }
}