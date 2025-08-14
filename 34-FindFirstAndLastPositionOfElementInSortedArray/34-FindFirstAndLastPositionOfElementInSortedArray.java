// Last updated: 14/08/2025, 11:35:17
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int x=0;
        int y=0;
        if(nums.length==0){
            x=-1;
            y=-1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                x=i;
                break;
            }
            else{
                x=-1;
            }
        }
        for(int i=nums.length;i>0;i--){
            if(nums[i-1]==target){
                y=i-1;
                break;
            }
            else{
                y=-1;
            }
        }
        int[] arr=new int[2];
        arr[0]=x;
        arr[1]=y;
        return arr;

    }
}