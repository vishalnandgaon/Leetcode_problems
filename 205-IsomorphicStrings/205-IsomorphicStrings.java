// Last updated: 14/08/2025, 11:34:01
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mapS[charS] != mapT[charT]) {
                return false;
            }

            // Use i + 1 to avoid default value conflicts (0 is default).
            mapS[charS] = i + 1;
            mapT[charT] = i + 1;
        }

        return true;
    }
}
