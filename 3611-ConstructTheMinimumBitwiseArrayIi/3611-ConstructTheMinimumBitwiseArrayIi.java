// Last updated: 22/01/2026, 12:29:42
class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int ans[] = new int[nums.size()];
        for(int i = 0; i < nums.size(); i++) {
            int n = nums.get(i);
            if(n != 2) ans[i] = n - ((n + 1) & (-n - 1)) / 2;
            else ans[i] = -1;
        }  
        return ans;
    }
}