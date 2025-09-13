// Last updated: 13/09/2025, 22:27:01
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> easy=new HashMap<>();
        for(int i=0;i<nums.length;i++){

            if(easy.containsKey(nums[i])){
                if((i-easy.get(nums[i])<=k)){
                    return true;
                }
            }
            easy.put(nums[i],i);
        }
        return false;
    }
}