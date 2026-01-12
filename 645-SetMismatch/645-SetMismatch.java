// Last updated: 12/01/2026, 22:49:54
class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int dup=0;
        int missing=0;
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            sum+=nums[i];
            if((nums[i]^nums[i+1])==0){
                dup=nums[i];
            }
        }
        sum+=nums[nums.length-1]-dup;
        int actsum=(nums.length*(nums.length+1))/2;
        missing=actsum-sum;
        
        int[] ans=new int[2];
        ans[0]=dup;
        ans[1]=missing;
        return ans;

    }
}