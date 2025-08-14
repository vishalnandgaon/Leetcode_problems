// Last updated: 14/08/2025, 12:30:06
class Solution {
    public String concatHex36(int n) {
        int square=n*n;
        int cube=square*n;
        StringBuilder st= new StringBuilder();
        String base16=Integer.toString(square,16).toUpperCase();
        String base36=Integer.toString(cube,36).toUpperCase();
        st.append(base16);
        st.append(base36);
        return st.toString();

    }
}