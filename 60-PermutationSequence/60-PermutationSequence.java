// Last updated: 14/08/2025, 11:34:38
public class Solution {
    public String getPermutation(int n, int k) {
        // Step 1: Create a list of numbers to pick from.
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        // Step 2: Compute factorial of (n-1).
        int fact = 1;
        for (int i = 1; i < n; i++) {
            fact *= i;
        }

        // Step 3: Build the k-th permutation.
        StringBuilder result = new StringBuilder();
        k--;  // Decrease k by 1 to make it zero-indexed.

        for (int i = n - 1; i >= 0; i--) {
            int index = k / fact; // Find the index of the current digit.
            result.append(nums.get(index)); // Append the current digit to the result.
            nums.remove(index); // Remove the digit from the list.
            
            k %= fact; // Update k to reflect the position within the group.
            if (i != 0) {
                fact /= i; // Update fact to the factorial of the remaining digits.
            }
        }

        return result.toString();
    }
}
