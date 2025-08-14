// Last updated: 14/08/2025, 11:35:35
class Solution {
    public int myAtoi(String s) {
        // Trim leading/trailing whitespace
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1; // Default positive sign
        int result = 0;
        int i = 0;

        // Check for optional sign character
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Process numeric characters
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check for overflow/underflow before updating result
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
