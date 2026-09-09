// Last updated: 09/09/2026, 16:28:52
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        while(i<g.length && j<s.length){
            if(g[i]-s[j]<=0){
                i++;
            }
            j++;
        }
        return i;
    }
}