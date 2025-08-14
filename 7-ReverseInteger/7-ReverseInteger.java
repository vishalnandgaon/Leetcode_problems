// Last updated: 14/08/2025, 11:35:37
public class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int sign = x < 0 ? -1 : 1; // Store the sign
        x = Math.abs(x); // Work with the absolute value

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow before actually reversing
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                return 0; // Overflow
            }

            reversed = reversed * 10 + digit;
        }

        return reversed * sign; // Restore the sign
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.reverse(123));   // Output: 321
        System.out.println(solution.reverse(-123));  // Output: -321
        System.out.println(solution.reverse(120));   // Output: 21
        System.out.println(solution.reverse(1534236469)); // Output: 0 (overflow)
    }
}
