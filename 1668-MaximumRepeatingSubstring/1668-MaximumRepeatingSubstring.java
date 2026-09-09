// Last updated: 09/09/2026, 16:16:22
class Solution {
    public int maxRepeating(String sequence, String word) {
        int k = 0;
        String curr = word;

        while (sequence.contains(curr)) {
            k++;
            curr += word;
        }

        return k;
    }
}