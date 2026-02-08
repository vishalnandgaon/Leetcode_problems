// Last updated: 08/02/2026, 21:38:15
class Solution {
    public int dominantIndices(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int average=avg(nums,i);
            if(nums[i]>average) count++;
        }
        return count-1;
    }
    private int avg(int[] nums,int l){
        int sum=0;
        for(int i=l+1;i<nums.length;i++){
            sum+=nums[i];
        }
        int divide=nums.length-l-1;
        if(divide==0) return 0;
        return sum/divide;
    }
}