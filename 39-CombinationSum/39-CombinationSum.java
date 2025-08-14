// Last updated: 14/08/2025, 11:35:09
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        backtrack(candidates, target, 0, currentCombination, result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> currentCombination, List<List<Integer>> result) {
        // If the target is 0, we found a valid combination
        if (target == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        
        // Try all candidates starting from the current index
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                // Include the candidate in the current combination and explore further
                currentCombination.add(candidates[i]);
                // Since we can use the same number multiple times, we pass `i` instead of `i+1`
                backtrack(candidates, target - candidates[i], i, currentCombination, result);
                // Backtrack, remove the last element
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }
}
/*class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
    }
}*/