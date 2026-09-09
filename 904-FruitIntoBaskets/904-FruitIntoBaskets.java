// Last updated: 09/09/2026, 16:23:54
class Solution {
    public int totalFruit(int[] fruits) {
        int start=0;
        int end=0;
        int n=fruits.length;
        int maxlen=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(end<n){
            map.put(fruits[end],map.getOrDefault(fruits[end],0)+1);
            while(map.size()>=3){
                map.put(fruits[start],map.get(fruits[start])-1);
                if(map.get(fruits[start])==0){
                    map.remove(fruits[start]);
                }
                start++;
            }
            int currlen=end-start+1;
            maxlen=Math.max(currlen,maxlen);
            end++;
        }
        return maxlen;
    }
}