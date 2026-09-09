// Last updated: 09/09/2026, 16:11:44
class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int idx1=-1;
        int idx2=-1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(min>nums[i]){
                min=nums[i];
                idx1=i;
            }
            if(max<nums[i]){
                max=nums[i];
                idx2=i;
            }
        }
        if(idx1>idx2){
            int one=idx1+1;
            int two=idx2+1+n-idx1;
            int three=n-idx2;
            return Math.min(one,Math.min(two,three));
        }
        else if(idx2>idx1){
            int one=idx2+1;
            int two=idx1+1+n-idx2;
            int three=n-idx1;
            return Math.min(one,Math.min(two,three));
        }
        return 1;
    }
}