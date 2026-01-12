// Last updated: 12/01/2026, 22:47:25
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