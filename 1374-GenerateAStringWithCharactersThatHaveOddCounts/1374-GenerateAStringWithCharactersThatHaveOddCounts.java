// Last updated: 09/09/2026, 16:18:51
class Solution {
    public String generateTheString(int n) {
        char[] res = new char[n];
        for(int i = 0;i < n; i++)
        {
            res[i] = 'a';
        }
        if(n % 2 == 0) res[n - 1] = 'b';
        
        return new String(res);
    }
}