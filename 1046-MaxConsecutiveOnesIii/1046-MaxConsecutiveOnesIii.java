// Last updated: 02/10/2025, 10:54:34
class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=0;
        int maxlen=0;
        int left=0;
        int[] res=new int[2];
        for(int right=0;right<nums.length;right++){
            int dig=nums[right];
            res[dig]++;
            while(res[0]>k){
                res[nums[left]]--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}