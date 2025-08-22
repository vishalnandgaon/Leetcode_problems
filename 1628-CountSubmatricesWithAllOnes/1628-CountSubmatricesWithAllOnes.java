// Last updated: 22/08/2025, 11:48:04
class Solution {
    public int numSubmat(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int res = 0;

        // Build histogram for each row
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && i > 0) {
                    mat[i][j] += mat[i - 1][j];
                }
            }
        }

        // Count submatrices for each row
        for (int i = 0; i < m; i++) {
            res += countRow(mat[i]);
        }

        return res;
    }

    // Helper method to count submatrices for a histogram row
    private int countRow(int[] row) {
        int n = row.length;
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        int[] sum = new int[n];

        for (int j = 0; j < n; j++) {
            while (!stack.isEmpty() && row[stack.peek()] >= row[j]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                int prev = stack.peek();
                sum[j] = sum[prev] + row[j] * (j - prev);
            } else {
                sum[j] = row[j] * (j + 1);
            }

            stack.push(j);
            res += sum[j];
        }

        return res;
    }
}
