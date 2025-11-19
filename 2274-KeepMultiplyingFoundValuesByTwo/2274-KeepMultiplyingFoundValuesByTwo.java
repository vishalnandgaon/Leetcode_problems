// Last updated: 19/11/2025, 15:41:26
class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        while(set.contains(original)){
            original*=2;
        }
        return original;
    }
}