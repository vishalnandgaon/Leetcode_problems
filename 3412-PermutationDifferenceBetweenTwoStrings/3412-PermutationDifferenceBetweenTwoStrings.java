// Last updated: 14/09/2025, 21:36:04
class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        int ans=0;
        for(int i=0;i<t.length();i++){
            ans+=Math.abs(map.get(t.charAt(i))-i);
        }
        return ans;
    }
}