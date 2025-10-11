// Last updated: 11/10/2025, 23:35:03
class Solution {
    public int uniquePathsIII(int[][] grid) {
        int startX = 0, startY = 0, empty = 0;
        int m = grid.length, n = grid[0].length;

        // count empty + find start
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] >= 0) empty++;
                if (grid[i][j] == 1) {
                    startX = i; startY = j;
                }
            }
        }
        return dfs(grid, startX, startY, empty);
    }

    private int dfs(int[][] g, int x, int y, int remain) {
        if (g[x][y] == 2) return remain == 1 ? 1 : 0; // must cover all cells

        int temp = g[x][y];
        g[x][y] = -1; // mark visited
        int paths = 0;

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int[] d : dirs) {
            int nx = x + d[0], ny = y + d[1];
            if (nx >= 0 && nx < g.length && ny >= 0 && ny < g[0].length && g[nx][ny] != -1) {
                paths += dfs(g, nx, ny, remain - 1);
            }
        }

        g[x][y] = temp; // backtrack
        return paths;
    }
}
