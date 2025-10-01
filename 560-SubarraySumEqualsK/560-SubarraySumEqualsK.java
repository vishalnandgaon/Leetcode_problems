// Last updated: 01/10/2025, 17:50:18
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        for(int i=0;i<nums.length;i++){
            if(prefix[i]==k) count++;

            for(int j=0;j<i;j++){
                if(prefix[i]-prefix[j]==k) count++;
            }
        }
        return count;
    }
}