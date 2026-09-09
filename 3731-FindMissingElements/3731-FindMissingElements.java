// Last updated: 09/09/2026, 15:56:58
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int min=(int)1e9;
        int max=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
            set.add(nums[i]);
        }
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}