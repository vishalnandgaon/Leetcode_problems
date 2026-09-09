// Last updated: 09/09/2026, 16:17:28
public class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        char[] shuffled = new char[n];

        for (int i = 0; i < n; i++) {
            shuffled[indices[i]] = s.charAt(i);
        }

        return new String(shuffled);
    }
}