// Last updated: 26/10/2025, 18:00:08
/**
 * Use a StringBuilder to keep track of result string. Use a stack to keep track
 * of count of last seen characters.
 *
 * Update count or pop the count from stack if the current and previous
 * characters are same in the StringBuilder
 *
 * Time Complexity: O(N + N) = O(N) -> Iterate over string + sb.toString()
 *
 * Space Complexity: O(N + N) = O(N) -> Stack + StringBuilder
 *
 * N = Length of input string.
 */
class Solution {
    public String removeDuplicates(String s, int k) {
        if (s == null || k <= 1) {
            // Ask Interviewer about this base case. You can also return null here.
            throw new IllegalArgumentException("Invalid Input");
        }

        int len = s.length();
        if (len < k) {
            return s;
        }

        // This stack is used to keep track of count of last seen characters.
        Deque<Integer> countStack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            // Append the current character and get the index of the current character in
            // StringBuilder
            sb.append(s.charAt(i));
            int sbLastIdx = sb.length() - 1;

            // If the current and previous character are same in the StringBuilder, Update
            // count or pop the count from stack
            if (sbLastIdx > 0 && sb.charAt(sbLastIdx - 1) == sb.charAt(sbLastIdx)) {
                int count = countStack.pop();
                if (count + 1 < k) {
                    countStack.push(count + 1);
                } else {
                    sb.setLength(sb.length() - k);
                }
            } else {
                countStack.push(1);
            }
        }

        return sb.toString();
    }
}