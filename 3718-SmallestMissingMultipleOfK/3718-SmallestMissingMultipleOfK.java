// Last updated: 09/09/2026, 15:57:10
class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int count=1;
        while(set.contains(k*count)){
            count++;
        }
        return count*k;
    }
}