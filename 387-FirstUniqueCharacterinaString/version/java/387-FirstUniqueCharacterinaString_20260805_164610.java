// Last updated: 05/08/2026, 16:46:10
1class Solution {
2    public String reverseWords(String s) {
3        String[] st=s.split(" ");
4        for(int i=0;i<st.length;i++){
5            st[i]=reverse(st[i]);
6        }
7        String s2="";
8        for(int i=0;i<st.length;i++){
9            s2=s2+st[i]+" ";
10        }
11        return s2.trim();
12
13    }
14    private String reverse(String s1){
15        int j=s1.length()-1;
16        String ans="";
17        while(j>=0){
18            ans=ans+s1.charAt(j);
19            j--;
20        }
21        return ans;
22    }
23}