// Last updated: 14/08/2025, 11:35:07
/*class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
    }
}*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);  // Sort to handle duplicates
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> currentCombination, List<List<Integer>> result) {
        // Base case: if the target becomes 0, we found a valid combination
        if (target == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            // If the current number is greater than the remaining target, we stop exploring further
            if (candidates[i] > target) break;
            
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            
            // Choose the current number
            currentCombination.add(candidates[i]);
            // Explore further with the reduced target, using the next number (i+1) to prevent reuse
            backtrack(candidates, target - candidates[i], i + 1, currentCombination, result);
            // Backtrack, remove the last added element
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
