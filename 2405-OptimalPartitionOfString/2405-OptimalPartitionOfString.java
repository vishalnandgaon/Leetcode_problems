// Last updated: 09/09/2026, 16:09:11
class Solution {
    public int partitionString(String s) {
        int count=0;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                count++;
                set.clear();
            }
            set.add(s.charAt(i));
        }
        return count+1;
    }
}