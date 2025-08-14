// Last updated: 14/08/2025, 11:34:57
/*class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
    }
}*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Sort the input array to easily handle duplicates
        backtrack(nums, new ArrayList<>(), result, new boolean[nums.length]);
        return result;
    }
    
    private void backtrack(int[] nums, List<Integer> current, List<List<Integer>> result, boolean[] used) {
        // If the current permutation is of the same length as nums, add it to result
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));  // Make a copy of the current list
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            // Skip used elements or skip duplicates (ensure we only use the first occurrence of each duplicate)
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue;
            }
            
            // Mark the current element as used
            used[i] = true;
            current.add(nums[i]);
            
            // Recurse to build the next part of the permutation
            backtrack(nums, current, result, used);
            
            // Backtrack: Unmark the current element and remove it from the current permutation
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }
}
