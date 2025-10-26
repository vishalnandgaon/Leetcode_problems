// Last updated: 26/10/2025, 17:59:33
import java.util.*;

class Solution {
    private static final List<Integer> balanced = new ArrayList<>();

    static {
        // Generate all numerically balanced numbers up to 10^7 once
        generate("", new int[10]);
        Collections.sort(balanced);
    }

    // Recursive generator for all combinations
    private static void generate(String prefix, int[] count) {
        if (!prefix.isEmpty()) {
            int num = Integer.parseInt(prefix);
            if (num <= 10_000_000 && isBalanced(count))
                balanced.add(num);
        }
        if (prefix.length() >= 7) return;  // limit search depth

        for (char ch = '1'; ch <= '9'; ch++) {
            count[ch - '0']++;
            generate(prefix + ch, count);
            count[ch - '0']--;
        }
    }

    // Check if current digit count satisfies "balanced" property
    private static boolean isBalanced(int[] count) {
        for (int d = 1; d <= 9; d++) {
            if (count[d] > 0 && count[d] != d)
                return false;
        }
        return true;
    }

    // Main API
    public int nextBeautifulNumber(int n) {
        int idx = Collections.binarySearch(balanced, n + 1);
        if (idx < 0) idx = -idx - 1;
        return idx < balanced.size() ? balanced.get(idx) : -1;
    }
}
