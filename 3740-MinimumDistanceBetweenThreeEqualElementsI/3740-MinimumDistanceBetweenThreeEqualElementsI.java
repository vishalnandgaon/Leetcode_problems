// Last updated: 09/09/2026, 15:56:53
import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        // Store indices
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        
        int ans = Integer.MAX_VALUE;
        
        // Check for each number
        for (List<Integer> list : map.values()) {
            if (list.size() >= 3) {
                for (int i = 0; i <= list.size() - 3; i++) {
                    int i1 = list.get(i);
                    int i3 = list.get(i + 2);
                    
                    ans = Math.min(ans, 2 * (i3 - i1));
                }
            }
        }
        
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}