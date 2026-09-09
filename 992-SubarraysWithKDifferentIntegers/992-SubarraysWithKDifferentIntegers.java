// Last updated: 09/09/2026, 16:22:40
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmostK(nums,k)-atmostK(nums,k-1);
    }
    private int atmostK(int[] nums,int k){
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int start=0;
        int count=0;
        for(int end=0;end<n;end++){
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);
            while(map.size()>k){
                map.put(nums[start],map.get(nums[start])-1);
                if(map.get(nums[start])==0){
                    map.remove(nums[start]);
                }
                start++;
            }
            count+=end-start+1;
        }
        return count;
    }
}