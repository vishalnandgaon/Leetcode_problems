// Last updated: 22/11/2025, 22:13:16
class Solution {
    public int minimumOperations(int[] nums) {
        int ans=0;
        for(int num:nums){
            if(num%3 !=0){
                ans++;
            }
        }
        return ans;
    }
}