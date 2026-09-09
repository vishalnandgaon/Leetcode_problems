// Last updated: 09/09/2026, 16:03:27
class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] res = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            int n = nums.get(i);
            if ((n & 1) == 1)
                res[i] = n & ~(((n + 1) & ~n) >> 1);
            else
                res[i] = -1;
        }
        return res;
    }
}
