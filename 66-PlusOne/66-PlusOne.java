// Last updated: 14/08/2025, 11:34:31
public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Start from the last digit
        for (int i = n - 1; i >= 0; i--) {
            // If the digit is less than 9, just increment it and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the digit is 9, set it to 0 and continue to the next digit
            digits[i] = 0;
        }
        
        // If we are here, it means we had a carry from the last digit, so we need to add a 1 at the front
        int[] result = new int[n + 1];
        result[0] = 1;  // Add 1 to the front
        return result;
    }
}
