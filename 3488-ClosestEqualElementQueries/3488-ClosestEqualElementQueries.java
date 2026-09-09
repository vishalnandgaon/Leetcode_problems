// Last updated: 09/09/2026, 16:02:01
class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<Integer>());
            }
            map.get(nums[i]).add(i);
        }

        int[] precomputed=new int[nums.length];
        Arrays.fill(precomputed,-1);

        for(List<Integer> list:map.values()){
            int len=list.size();
            if(len==1) continue;
            for(int i=0;i<len;i++){
                int curr=list.get(i);
                int prev=list.get((i-1+len)%len);
                int next=list.get((i+1)%len);
                int dist1= Math.abs(curr-prev);
                int dist2=Math.abs(next-curr);
                int dist3=nums.length-dist1;
                int dist4=nums.length-dist2;
                precomputed[curr]=Math.min(Math.min(Math.min(dist1,dist2),dist3),dist4);
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int q:queries){
            ans.add(precomputed[q]);
        }
        return ans;
    }
}