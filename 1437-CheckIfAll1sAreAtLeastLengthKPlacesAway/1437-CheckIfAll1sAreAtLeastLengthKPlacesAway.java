// Last updated: 09/09/2026, 16:18:26
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                idx=i;
                break;
            }
        }
        int stat=idx;
        for(int i=stat+1;i<nums.length;i++){
            if(nums[i]==1){
                if((i-idx)<=k){
                    return false;
                }
                idx=i;
            }
        }

        return true;
    }
}