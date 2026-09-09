// Last updated: 09/09/2026, 16:22:25
class Solution {
    public int bitwiseComplement(int t) {
        if(t==0) return 1;
        String binary=Integer.toBinaryString(t);
        int n=binary.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append('1');
        }
        String all=sb.toString();
        StringBuilder st=new StringBuilder();
        for(int i=0;i<n;i++){
            st.append(all.charAt(i)-binary.charAt(i));
        } 
        String res=st.toString();
        int ans=Integer.parseInt(res,2);
        return ans;
    }
}