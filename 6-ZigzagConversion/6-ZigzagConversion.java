// Last updated: 14/08/2025, 11:35:38
/*class Solution {
    public String convert(String s, int numRows) {
        
    }
}*/
public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // Create an array of StringBuilder objects for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Traverse the string and add characters to the appropriate row
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // Determine direction change
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Update the current row
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows to get the final result
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}

