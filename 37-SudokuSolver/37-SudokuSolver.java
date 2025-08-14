// Last updated: 14/08/2025, 11:35:12
/*class Solution {
    public void solveSudoku(char[][] board) {
        
    }
}*/
public class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // If the cell is empty (i.e., '.')
                if (board[i][j] == '.') {
                    // Try each digit from 1 to 9
                    for (char num = '1'; num <= '9'; num++) {
                        if (isValid(board, i, j, num)) {
                            board[i][j] = num;  // Place the number
                            // Recursively attempt to fill the next empty cell
                            if (solve(board)) {
                                return true;
                            }
                            // Backtrack if placing the number doesn't lead to a solution
                            board[i][j] = '.'; 
                        }
                    }
                    // If no valid number can be placed, return false (backtrack)
                    return false;
                }
            }
        }
        return true;  // All cells are filled correctly
    }

    // Function to check if placing num at board[i][j] is valid
    private boolean isValid(char[][] board, int row, int col, char num) {
        // Check if the number is in the same row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check if the number is in the same column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check if the number is in the same 3x3 subgrid
        int startRow = row / 3 * 3;
        int startCol = col / 3 * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;  // The number can be placed
    }
}
