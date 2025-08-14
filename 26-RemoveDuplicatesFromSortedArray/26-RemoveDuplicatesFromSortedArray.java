// Last updated: 14/08/2025, 11:35:24
class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>100){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    nums[j]=101;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=100){
                nums[count++]=nums[i];
            }
        }
        return count;
    }
}