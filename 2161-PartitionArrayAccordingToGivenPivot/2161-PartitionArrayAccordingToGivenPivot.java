// Last updated: 09/09/2026, 16:10:59
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        List<Integer> small=new ArrayList<>();
        List<Integer> eq=new ArrayList<>();
        List<Integer> big=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(nums[i]<pivot) small.add(nums[i]);
            else if(nums[i]==pivot) eq.add(nums[i]);
            else big.add(nums[i]);
        }
        int[] ans=new int[n];
        int idx=0;
        for(int i=0;i<small.size();i++){
            ans[idx]=small.get(i);
            idx++;
        }
        for(int i=0;i<eq.size();i++){
            ans[idx]=eq.get(i);
            idx++;
        }
        for(int i=0;i<big.size();i++){
            ans[idx]=big.get(i);
            idx++;
        }
        return ans;
    }
}