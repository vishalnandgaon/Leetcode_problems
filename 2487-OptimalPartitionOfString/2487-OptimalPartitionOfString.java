// Last updated: 22/09/2025, 10:33:49
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