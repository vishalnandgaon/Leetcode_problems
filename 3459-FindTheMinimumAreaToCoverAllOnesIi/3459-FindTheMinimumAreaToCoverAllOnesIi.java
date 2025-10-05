// Last updated: 05/10/2025, 09:09:25
class Solution {

    // Compute area of the minimal axis-aligned rectangle covering all 1s in subgrid [si..ei] × [sj..ej].
    // Returns 0 if there are no 1s in that subgrid.
    private int minArea(int[][] grid, int si, int ei, int sj, int ej) {
        int minR = Integer.MAX_VALUE, minC = Integer.MAX_VALUE;
        int maxR = Integer.MIN_VALUE, maxC = Integer.MIN_VALUE;
        for (int i = si; i <= ei; ++i) {
            for (int j = sj; j <= ej; ++j) {
                if (grid[i][j] == 1) {
                    minR = Math.min(minR, i);
                    minC = Math.min(minC, j);
                    maxR = Math.max(maxR, i);
                    maxC = Math.max(maxC, j);
                }
            }
        }
        if (minR == Integer.MAX_VALUE) return 0;
        return (maxR - minR + 1) * (maxC - minC + 1);
    }

    public int minimumSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int ans = m * n;  // Upper bound: entire grid

        // Case 1: Split horizontally into three parts
        for (int i1 = 0; i1 < m - 1; ++i1) {
            for (int i2 = i1 + 1; i2 < m - 1; ++i2) {
                int a1 = minArea(grid, 0, i1, 0, n - 1);
                int a2 = minArea(grid, i1 + 1, i2, 0, n - 1);
                int a3 = minArea(grid, i2 + 1, m - 1, 0, n - 1);
                if (a1 > 0 && a2 > 0 && a3 > 0) {
                    ans = Math.min(ans, a1 + a2 + a3);
                }
            }
        }

        // Case 2: Split vertically into three parts
        for (int j1 = 0; j1 < n - 1; ++j1) {
            for (int j2 = j1 + 1; j2 < n - 1; ++j2) {
                int a1 = minArea(grid, 0, m - 1, 0, j1);
                int a2 = minArea(grid, 0, m - 1, j1 + 1, j2);
                int a3 = minArea(grid, 0, m - 1, j2 + 1, n - 1);
                if (a1 > 0 && a2 > 0 && a3 > 0) {
                    ans = Math.min(ans, a1 + a2 + a3);
                }
            }
        }

        // Case 3: Mixed splits – combinations using one horizontal and one vertical split
        for (int i = 0; i < m - 1; ++i) {
            for (int j = 0; j < n - 1; ++j) {
                // Strategy 1: Split top into two, bottom as one
                int t1 = minArea(grid, 0, i, 0, j);
                int t2 = minArea(grid, 0, i, j + 1, n - 1);
                int b = minArea(grid, i + 1, m - 1, 0, n - 1);
                if (t1 > 0 && t2 > 0 && b > 0) {
                    ans = Math.min(ans, t1 + t2 + b);
                }

                // Strategy 2: Split bottom into two, top as one
                int bt1 = minArea(grid, i + 1, m - 1, 0, j);
                int bt2 = minArea(grid, i + 1, m - 1, j + 1, n - 1);
                int tt = minArea(grid, 0, i, 0, n - 1);
                if (bt1 > 0 && bt2 > 0 && tt > 0) {
                    ans = Math.min(ans, bt1 + bt2 + tt);
                }

                // Strategy 3: Split left into two, right as one
                int lt1 = minArea(grid, 0, i, 0, j);
                int lb1 = minArea(grid, i + 1, m - 1, 0, j);
                int r = minArea(grid, 0, m - 1, j + 1, n - 1);
                if (lt1 > 0 && lb1 > 0 && r > 0) {
                    ans = Math.min(ans, lt1 + lb1 + r);
                }

                // Strategy 4: Split right into two, left as one
                int rt1 = minArea(grid, 0, i, j + 1, n - 1);
                int rb1 = minArea(grid, i + 1, m - 1, j + 1, n - 1);
                int l = minArea(grid, 0, m - 1, 0, j);
                if (rt1 > 0 && rb1 > 0 && l > 0) {
                    ans = Math.min(ans, rt1 + rb1 + l);
                }
            }
        }

        return ans;
    }
}
