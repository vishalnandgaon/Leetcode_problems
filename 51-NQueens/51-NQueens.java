// Last updated: 14/08/2025, 11:34:51
import java.util.*;

public class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        // Backtracking function to find all solutions
        backtrack(result, new ArrayList<>(), new HashSet<>(), new HashSet<>(), new HashSet<>(), n, 0);
        return result;
    }
    
    private void backtrack(List<List<String>> result, List<String> currentBoard, 
                           Set<Integer> cols, Set<Integer> diag1, Set<Integer> diag2, 
                           int n, int row) {
        // If all queens are placed, add the current board configuration to the result
        if (row == n) {
            result.add(new ArrayList<>(currentBoard));
            return;
        }
        
        // Try every column in the current row
        for (int col = 0; col < n; col++) {
            // Check if placing the queen at (row, col) is safe
            if (cols.contains(col) || diag1.contains(row - col) || diag2.contains(row + col)) {
                continue;
            }
            
            // Add the current column and diagonals to the sets
            cols.add(col);
            diag1.add(row - col);
            diag2.add(row + col);
            
            // Place the queen and move to the next row
            char[] rowArr = new char[n];
            Arrays.fill(rowArr, '.');
            rowArr[col] = 'Q';
            currentBoard.add(new String(rowArr));
            
            // Recurse to the next row
            backtrack(result, currentBoard, cols, diag1, diag2, n, row + 1);
            
            // Backtrack: remove the queen and undo the changes
            currentBoard.remove(currentBoard.size() - 1);
            cols.remove(col);
            diag1.remove(row - col);
            diag2.remove(row + col);
        }
    }
}
/*class Solution {
    public List<List<String>> solveNQueens(int n) {
        
    }
}*/