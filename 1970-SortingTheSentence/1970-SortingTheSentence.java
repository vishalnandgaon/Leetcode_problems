// Last updated: 19/09/2025, 19:13:12
class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        Arrays.sort(arr,(a,b)->{
            int lasta=a.charAt(a.length()-1)-'0';
            int lastb=b.charAt(b.length()-1)-'0';
            return Integer.compare(lasta,lastb);
            });
            StringBuilder st=new StringBuilder();
            for(int i=0;i<arr.length;i++){
                st.append(arr[i].substring(0,arr[i].length()-1));
                st.append(" ");
            }
            return st.toString().trim();

        }
}