// Last updated: 07/09/2025, 12:29:11
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int operations=sum%k;
        return operations;
    }
}