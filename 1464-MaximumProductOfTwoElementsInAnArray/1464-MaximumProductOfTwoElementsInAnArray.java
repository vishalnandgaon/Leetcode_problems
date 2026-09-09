// Last updated: 09/09/2026, 16:18:06
class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length-1;
        // Arrays.sort(nums);
        // return (nums[n]-1)*(nums[n-1]-1);
        // Optimized 

        int prev2=0;
        int prev1=0;
        for(int i=0;i<=n;i++){
            if(prev1<=nums[i]){
            prev2=prev1;
            prev1=nums[i];
            }
            else if(prev2<nums[i]){
                prev2=nums[i];
            }
        }
        return (prev1-1)*(prev2-1);
    }
}