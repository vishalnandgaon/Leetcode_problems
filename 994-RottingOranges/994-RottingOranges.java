// Last updated: 09/09/2026, 16:22:37
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int fresh=0;
        int minutes=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty() && fresh>0){
            minutes++;
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] arr=q.poll();
                for(int[] a:dir){
                    int r=a[0]+arr[0];
                    int c=a[1]+arr[1];
                    if(r>=0 && r<n && c>=0 && c<m && grid[r][c]==1){
                        grid[r][c]=2;
                        q.add(new int[]{r,c});
                        fresh--;
                    }
                }
            }
        }
        return fresh==0?minutes:-1;
    }
}