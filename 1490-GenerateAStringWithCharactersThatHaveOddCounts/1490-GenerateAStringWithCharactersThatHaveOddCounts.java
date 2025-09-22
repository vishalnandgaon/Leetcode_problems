// Last updated: 22/09/2025, 10:34:38
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