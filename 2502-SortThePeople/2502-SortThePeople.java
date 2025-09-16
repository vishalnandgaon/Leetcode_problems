// Last updated: 16/09/2025, 20:03:42
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i=0;i<names.length;i++){
            names[i]=map.get(heights[names.length-1-i]);
        }
        return names;
    }
}