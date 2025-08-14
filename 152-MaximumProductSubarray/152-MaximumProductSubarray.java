// Last updated: 14/08/2025, 11:34:10
/*class Solution {
    public int maxProduct(int[] nums) {
        
    }
}*/
public class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int currentNum = nums[i];

            // Since a negative number could swap max and min, we store maxProduct temporarily
            int tempMax = Math.max(currentNum, Math.max(maxProduct * currentNum, minProduct * currentNum));
            minProduct = Math.min(currentNum, Math.min(maxProduct * currentNum, minProduct * currentNum));
            maxProduct = tempMax;

            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
