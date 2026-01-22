// Last updated: 22/01/2026, 12:34:37
class Solution {
    public String countOfAtoms(String formula) {
        int n = formula.length();
        Stack<TreeMap<String,Integer>> st = new Stack<>();
        st.push(new TreeMap<>());
        for(int i = 0; i<n; i++){
            char ch = formula.charAt(i);
            if(ch == ('(')){
                st.push(new TreeMap<>());
            }
            else if(ch == (')')){
                int num = 0;
                while((i+1) < n && Character.isDigit(formula.charAt(i+1))){
                    num = num*10+(formula.charAt(i+1)-'0');
                    i++;
                }
                num = (num == 0) ? 1 : num;
                TreeMap<String,Integer> mp = st.pop();
                TreeMap<String,Integer> mp2 = st.pop();
                for(String el : mp.keySet()){
                    mp2.put(el,mp2.getOrDefault(el,0)+mp.getOrDefault(el,0)*num);
                }
                st.push(mp2);
            }
            else{
                String str = ch+"";
                int num = 0;
                while((i+1) < n && Character.isLowerCase(formula.charAt(i+1))){
                    str += formula.charAt(i+1);
                    i++;
                }
                while((i+1) < n && Character.isDigit(formula.charAt(i+1))){
                    num = num*10+(formula.charAt(i+1)-'0');
                    i++;
                }
                num = (num == 0) ? 1 : num;
                TreeMap<String,Integer> mp = st.pop();
                mp.put(str,mp.getOrDefault(str,0)+num);
                st.push(mp);
            }
        }
        StringBuilder sb = new StringBuilder();
       
        TreeMap<String,Integer> mp = st.pop();
        for(String key : mp.keySet()){
            sb.append(key);
            if(mp.get(key) > 1){
                sb.append(mp.get(key));
            }
        }
        return sb.toString();
    }
}