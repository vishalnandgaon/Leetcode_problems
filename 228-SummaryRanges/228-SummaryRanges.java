// Last updated: 09/09/2026, 16:31:38
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int n = nums.length;
        
        if (n == 0) return list;

        int i = 0;

        while (i < n) {
            int j = i;
            while (j + 1 < n && nums[j + 1] == nums[j] + 1) {
                j++;
            }
            if (i == j) {
                list.add(String.valueOf(nums[i]));
            } 
            else {
                list.add(nums[i] + "->" + nums[j]);
            }

            i = j + 1;
        }

        return list;
    }
}