// Last updated: 09/09/2026, 16:18:56
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted=nums.clone();
        Arrays.sort(sorted);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(sorted[i],i);
        }

        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=map.get(nums[i]);
        }
        return ans;
    }
}