// Last updated: 14/08/2025, 11:35:03
public class Solution {
    public String multiply(String num1, String num2) {
        // Edge case: If either num1 or num2 is "0", the result is "0"
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length(), n = num2.length();
        // Result array to store the intermediate results (maximum size m + n)
        int[] res = new int[m + n];
        
        // Multiply each digit in num1 with each digit in num2
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                // Position in the result array
                int p1 = i + j, p2 = i + j + 1;
                // Add the product to the current position
                int sum = mul + res[p2];
                res[p2] = sum % 10; // Store the current digit
                res[p1] += sum / 10; // Carry the result to the next higher position
            }
        }
        
        // Convert the result array into a string
        StringBuilder sb = new StringBuilder();
        for (int num : res) {
            if (!(sb.length() == 0 && num == 0)) { // Avoid leading zeros
                sb.append(num);
            }
        }
        
        return sb.toString();
    }
}
