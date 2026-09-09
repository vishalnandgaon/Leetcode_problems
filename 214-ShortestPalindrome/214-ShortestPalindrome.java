// Last updated: 09/09/2026, 16:32:02
class Solution {

    public String shortestPalindrome(String s) {

        String rev = new StringBuilder(s).reverse().toString();

        String combined = s + "#" + rev;

        int[] lps = buildLPS(combined);

        // longest palindromic prefix length
        int palindromeLength = lps[combined.length() - 1];

        // remaining suffix
        String remaining = s.substring(palindromeLength);

        // reverse and add in front
        String addFront =
                new StringBuilder(remaining).reverse().toString();

        return addFront + s;
    }

    private int[] buildLPS(String str) {

        int n = str.length();

        int[] lps = new int[n];

        int len = 0;
        int i = 1;

        while (i < n) {

            if (str.charAt(i) == str.charAt(len)) {

                len++;

                lps[i] = len;

                i++;

            } else {

                if (len != 0) {

                    len = lps[len - 1];

                } else {

                    lps[i] = 0;

                    i++;
                }
            }
        }

        return lps;
    }
}