// Last updated: 14/08/2025, 11:35:13
/*class Solution {
    public boolean isValidSudoku(char[][] board) {
        
    }
}*/
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Sets to track seen numbers in rows, columns, and subgrids
        Set<String> rows = new HashSet<>();
        Set<String> cols = new HashSet<>();
        Set<String> subgrids = new HashSet<>();
        
        // Iterate through the board to check the rules
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                
                // Skip empty cells
                if (num == '.') continue;
                
                // Create a unique identifier for each row, column, and subgrid
                String rowKey = "row" + i + "-" + num;
                String colKey = "col" + j + "-" + num;
                String subgridKey = "subgrid" + (i / 3) + "-" + (j / 3) + "-" + num;
                
                // Check for duplication in row, column, or subgrid
                if (rows.contains(rowKey) || cols.contains(colKey) || subgrids.contains(subgridKey)) {
                    return false;  // Invalid if any duplicate found
                }
                
                // Add the current number to the respective sets
                rows.add(rowKey);
                cols.add(colKey);
                subgrids.add(subgridKey);
            }
        }
        
        // If no duplicates found, return true
        return true;
    }
}
