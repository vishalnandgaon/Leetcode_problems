// Last updated: 09/09/2026, 16:04:15
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