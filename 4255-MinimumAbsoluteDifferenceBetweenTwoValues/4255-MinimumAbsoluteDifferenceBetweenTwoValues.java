// Last updated: 09/04/2026, 22:12:54
class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int lastone=-1;
        int lasttwo=-1;
        int ans=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                lastone=i;
                if(lasttwo!=-1){
                    ans=Math.min(ans,Math.abs(lastone-lasttwo));
                }
            }
            else if(nums[i]==2){
                lasttwo=i;
                if(lastone!=-1){
                    ans=Math.min(ans,Math.abs(lastone-lasttwo));
                }
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}