// Last updated: 25/09/2025, 12:27:10
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr=s.split(" ");
        if(pattern.length()!=arr.length) return false;
        HashMap<Character,String> map=new HashMap<>();
        Set<String> used=new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(arr[i])) return false;
            }
            else{
                if(used.contains(arr[i])) return false;
                map.put(pattern.charAt(i),arr[i]);
                used.add(arr[i]);
            }
        } 
        return true;  
    }
}