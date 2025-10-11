// Last updated: 11/10/2025, 23:36:36
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums=new int[9];
        nums[0]=1;
        for(int i=1;i<9;i++){
            nums[i]=i+1;
        }

        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        solve(0,nums,list,ans,k,n,0);
        return list;
    }

    private void solve(int start,int[] nums,List<List<Integer>> list,List<Integer> ans,int k,int target,int sum){
        if(sum>target || ans.size()>k) return;

        if(sum==target && ans.size()==k){
            list.add(new ArrayList<>(ans));
            return;
        }

        for(int i=start;i<nums.length;i++){
            ans.add(nums[i]);
            solve(i+1,nums,list,ans,k,target,sum+nums[i]);
            ans.remove(ans.size()-1);
        }
    }
}