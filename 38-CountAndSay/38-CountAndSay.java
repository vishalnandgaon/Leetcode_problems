// Last updated: 14/08/2025, 11:35:10
/*class Solution {
    public String countAndSay(int n) {
        
    }
}()*/
public class Solution {
    public String countAndSay(int n) {
        String result = "1";  // Base case
        for (int i = 2; i <= n; i++) {
            StringBuilder nextTerm = new StringBuilder();
            int count = 1;
            // Iterate over the previous term
            for (int j = 1; j < result.length(); j++) {
                // If current character is same as the previous one, increment the count
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    // Otherwise, append the count and the previous character to nextTerm
                    nextTerm.append(count).append(result.charAt(j - 1));
                    count = 1;  // Reset the count
                }
            }
            // Append the last counted group
            nextTerm.append(count).append(result.charAt(result.length() - 1));
            result = nextTerm.toString();  // Update result to the new term
        }
        return result;
    }
}
