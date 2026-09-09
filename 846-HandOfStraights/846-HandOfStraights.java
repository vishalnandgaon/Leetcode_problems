// Last updated: 09/09/2026, 16:24:35
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(n%groupSize!=0) return false;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        Arrays.sort(hand);
        for(int i=0;i<n;i++){
            if(map.get(hand[i])==0) continue;
            int count=0;
            int start=hand[i];
            while(count<groupSize){
                if(!map.containsKey(start) || map.get(start)<=0) return false;
                map.put(start,map.getOrDefault(start,0)-1);
                start++;
                count++;
            }
        }
        return true;
    }
}