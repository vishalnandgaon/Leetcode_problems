// Last updated: 07/10/2025, 23:45:42
class Solution {
    public String makeGood(String s) {
        StringBuilder st = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (st.length() > 0 && Math.abs(st.charAt(st.length()-1) - c) == 32) {
                st.deleteCharAt(st.length()-1); // remove last
            } else {
                st.append(c);
            }
        }
        return st.toString();
    }
}
