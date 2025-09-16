// Last updated: 16/09/2025, 18:01:22
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