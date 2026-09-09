// Last updated: 09/09/2026, 16:07:19
class Solution {
    public boolean isGood(int[] nums) {
        int[] arr=new int[201];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            arr[nums[i]-1]++;
            max=Math.max(max,nums[i]);
        }

        if(arr[max-1] !=2) return false;
        for(int i=0;i<max-1;i++){
            if(arr[i]!=1){
                return false;
            }
        }
        return true;
    }
}