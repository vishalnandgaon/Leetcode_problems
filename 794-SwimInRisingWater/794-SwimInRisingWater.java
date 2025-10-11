// Last updated: 11/10/2025, 23:35:12
class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        
        // Min-heap: [elevation, row, col]
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{grid[0][0], 0, 0});
        
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        int maxElevation = 0;
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int elevation = curr[0], r = curr[1], c = curr[2];
            
            // Update max elevation along path
            maxElevation = Math.max(maxElevation, elevation);
            
            // Reached destination
            if (r == n-1 && c == n-1) return maxElevation;
            
            // Mark visited
            if (visited[r][c]) continue;
            visited[r][c] = true;
            
            // Explore neighbors
            for (int[] d : directions) {
                int nr = r + d[0], nc = c + d[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n && !visited[nr][nc]) {
                    pq.offer(new int[]{grid[nr][nc], nr, nc});
                }
            }
        }
        return -1; // should never reach here
    }
}
