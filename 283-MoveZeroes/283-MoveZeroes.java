// Last updated: 11/10/2025, 23:35:56
class Solution {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = i;

        while (j < n) {

            // if ele at i = 0 and ele at j != 0 then swap
            if (nums[j] != 0) {
                // swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }

            j++;
            
        }
    }

}