// Last updated: 14/08/2025, 11:33:36
class Solution {
    public int pivotIndex(int[] nums) {
        int[] LeftSum=new int[nums.length];
        LeftSum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            LeftSum[i]=nums[i]+LeftSum[i-1];
        }
        int[] RightSum= new int[nums.length];
        RightSum[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            RightSum[i]=nums[i]+RightSum[i+1];
        }
        for(int i=0;i<nums.length;i++){
            if(RightSum[i]==LeftSum[i]){
                return i;
            }
        }
        return -1;
    }
}