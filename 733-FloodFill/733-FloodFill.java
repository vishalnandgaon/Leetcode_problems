// Last updated: 11/10/2025, 23:35:16
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int changeble=image[sr][sc];
        if(changeble==color) return image;
        solve(image,sr,sc,color,changeble);
        return image;
    }
    private void solve(int[][] image,int sr,int sc,int color,int changeble){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]!=changeble){
            return;
        }
        image[sr][sc]=color;

        solve(image,sr-1,sc,color,changeble);
        solve(image,sr,sc+1,color,changeble);
        solve(image,sr+1,sc,color,changeble);
        solve(image,sr,sc-1,color,changeble);
    }
}