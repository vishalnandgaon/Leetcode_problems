// Last updated: 14/09/2025, 21:37:03
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