// Last updated: 11/10/2025, 23:37:06
class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(board[r][c]==word.charAt(0)){
                    boolean ans=dfs(board,r,c,word,0);
                    if(ans) return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board,int r,int c,String word, int wordidx){
        // found case banaya h mene
        if(wordidx==word.length()) return true;

        // out of bound case

        if(r<0 || c<0 || r>=board.length || c>=board[0].length){
            return false;
        }
        // invalid case

        if(board[r][c]==' ' || board[r][c]!=word.charAt(wordidx)){
            return false;
        }

        // current character ko mark karta hu
        char ch=board[r][c];
        board[r][c]=' ';

        if(dfs(board,r-1,c,word,wordidx+1) ||
           dfs(board,r,c+1,word,wordidx+1) ||
           dfs(board,r+1,c,word,wordidx+1) ||
           dfs(board,r,c-1,word,wordidx+1) ){
            return true;
           }

        //backtracking karnaa

        board[r][c]=ch;
        return false;   


    }
}