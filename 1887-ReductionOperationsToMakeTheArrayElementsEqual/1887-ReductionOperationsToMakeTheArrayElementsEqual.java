// Last updated: 09/09/2026, 16:13:42
class Solution {
    public int reductionOperations(int[] nums) {

        Arrays.sort(nums);

        int operations = 0;
        int levels = 0;

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] != nums[i - 1]) {
                levels++;
            }

            operations += levels;
        }

        return operations;
    }
}