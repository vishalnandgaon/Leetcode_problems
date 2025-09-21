// Last updated: 21/09/2025, 15:16:42
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        int num=(n+k-1)/k;
        String[] ans=new String[num];
        StringBuilder st=new StringBuilder(s);
        while(st.length()%k!=0){
            st.append(fill);
        }

        for(int i=0;i<st.length();i+=k){
            ans[i/k]=st.substring(i,i+k);
        }
        return ans;
    }
}