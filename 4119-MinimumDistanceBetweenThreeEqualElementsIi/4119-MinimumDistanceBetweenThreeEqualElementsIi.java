// Last updated: 11/04/2026, 22:43:02
class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        int ans = Integer.MAX_VALUE;
        for (ArrayList<Integer> list : map.values()) {
            if (list.size() >= 3) {
                for (int i = 0; i <= list.size() - 3; i++) {
                    int dist = list.get(i + 2) - list.get(i);
                    ans = Math.min(ans, 2*dist);
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}