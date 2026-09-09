// Last updated: 09/09/2026, 16:25:29
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set=new HashSet<>();
        int ans=0;
        for(char ch:jewels.toCharArray()){
            set.add(ch);
        }
        for(char ch:stones.toCharArray()){
            if(set.contains(ch)) ans++;
        }
        return ans;
    }
}