// Last updated: 09/09/2026, 16:05:17
class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            if(map.containsKey(s.charAt(right))){
                while(map.get(s.charAt(right))==2){
                    map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
                    if(map.get(s.charAt(left))==0 ) map.remove(s.charAt(left));
                    left++;
                }
            }
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            max=Math.max(right-left+1,max);
        }
        return max;
    }
}