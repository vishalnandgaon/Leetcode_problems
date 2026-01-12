// Last updated: 12/01/2026, 22:50:27
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maximum=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                int temp=0;
                int j=i;
                while(j<nums.length && nums[j]==1){
                    j++;
                }
                temp=j-i;
                maximum=Math.max(temp,maximum);
                i=j-1;
            }
        }
        return maximum;
    }
}