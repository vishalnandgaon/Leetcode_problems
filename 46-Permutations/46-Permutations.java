// Last updated: 14/08/2025, 11:34:58
/*class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
    }
}*/
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(int[] nums, List<Integer> current, List<List<Integer>> result) {
        // If the current permutation has the same size as the input array, add it to the result
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current)); // Add a copy of current permutation to result
            return;
        }
        
        // Explore each number in nums
        for (int num : nums) {
            // If the number is already in the current permutation, skip it
            if (current.contains(num)) continue;
            
            // Add the number to the current permutation
            current.add(num);
            
            // Recurse with the new permutation
            backtrack(nums, current, result);
            
            // Backtrack by removing the number
            current.remove(current.size() - 1);
        }
    }
}
