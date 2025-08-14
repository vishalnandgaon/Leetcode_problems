// Last updated: 14/08/2025, 11:34:50
public class Solution {
    public int totalNQueens(int n) {
        int[] result = new int[1]; // Array used to store the number of solutions
        // Backtracking function to count the number of valid solutions
        backtrack(result, new HashSet<>(), new HashSet<>(), new HashSet<>(), n, 0);
        return result[0];
    }
    
    private void backtrack(int[] result, Set<Integer> cols, Set<Integer> diag1, 
                           Set<Integer> diag2, int n, int row) {
        // If all queens are placed, increment the solution count
        if (row == n) {
            result[0]++;
            return;
        }
        
        // Try every column in the current row
        for (int col = 0; col < n; col++) {
            // Check if placing the queen at (row, col) is valid
            if (cols.contains(col) || diag1.contains(row - col) || diag2.contains(row + col)) {
                continue; // Skip if there is a conflict
            }
            
            // Add the current column and diagonals to the sets
            cols.add(col);
            diag1.add(row - col);
            diag2.add(row + col);
            
            // Recurse to the next row
            backtrack(result, cols, diag1, diag2, n, row + 1);
            
            // Backtrack: remove the queen and undo the changes
            cols.remove(col);
            diag1.remove(row - col);
            diag2.remove(row + col);
        }
    }
}
