// Last updated: 09/04/2026, 22:13:15
class Solution {
    public int mod=1000000007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int[] arr:queries){
            int idx=arr[0];
            while(idx<=arr[1]){
                nums[idx]=(int)((long) nums[idx]*arr[3]%mod);
                idx+=arr[2];
            }
        }

        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        return xor;
    }
}