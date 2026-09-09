// Last updated: 09/09/2026, 16:35:37
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(list,new ArrayList<>(),nums,0);
        return list;
    }

    private void backtrack(List<List<Integer>> list,List<Integer> ans,int[] nums,int start){
        list.add(new ArrayList<>(ans));
        for(int i=start;i<nums.length;i++){
            ans.add(nums[i]);
            backtrack(list,ans,nums,i+1);
            ans.remove(ans.size()-1);
        }
    }
}