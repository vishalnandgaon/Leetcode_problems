// Last updated: 14/09/2025, 21:35:38
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        int count=0;
        for(int i=nums.length-1;i>=0;i--){
            if(!set.contains(nums[i]) && count<k){
                set.add(nums[i]);
                list.add(nums[i]);
                count++;
            }
        }
        int[] ans=new int[list.size()];
        for(int j=0;j<list.size();j++){
                ans[j]=list.get(j);
        }
        return ans;
    }
}