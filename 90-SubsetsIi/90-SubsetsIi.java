// Last updated: 11/10/2025, 23:37:02
import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> list = new ArrayList<>();
        solve(nums, 0, new ArrayList<>(), list);
        return list;
    }
    private void solve(int[] nums, int idx, List<Integer>ans, List<List<Integer>> list) {
        list.add(new ArrayList<>(ans));  
        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) continue;
            ans.add(nums[i]);                 
            solve(nums, i + 1, ans, list); 
            ans.remove(ans.size() - 1);      
        }
    }
}