// Last updated: 09/09/2026, 16:22:46
class Solution {
    public int[] sortedSquares(int[] nums) {
        // OPTIMAL SOLUTION
        int n=nums.length;
        int left=0;
        int right=n-1;
        int index=n-1;
        int[] ans=new int[n];
        while(left<=right){
            int lefts=nums[left]*nums[left];
            int rights=nums[right]*nums[right];
            if(lefts>rights){
                ans[index--]=lefts;
                left++;
            }
            else{
                ans[index--]=rights;
                right--;
            }

        }
        return ans;
    }
}