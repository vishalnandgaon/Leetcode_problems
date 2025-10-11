// Last updated: 11/10/2025, 23:35:33
class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        solve(nums, list, ans, 0);
        return list;
    }

    private void solve(int[] nums, List<List<Integer>> list, List<Integer> ans, int idx) {
        if (ans.size() >= 2) {
            list.add(new ArrayList<>(ans));
        }
        HashSet<Integer> used = new HashSet<>();

        for (int i = idx; i < nums.length; i++) {
            if (used.contains(nums[i])) continue;
            if (ans.isEmpty() || nums[i] >= ans.get(ans.size() - 1)) {
                used.add(nums[i]);
                ans.add(nums[i]);
                solve(nums, list, ans, i + 1);
                ans.remove(ans.size() - 1);
            }
        }
    }
}
