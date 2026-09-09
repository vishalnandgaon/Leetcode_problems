// Last updated: 09/09/2026, 16:23:12
class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        n=n%14;
        if(n==0){
            n=14;
        }
        
        for(int i=0;i<n;i++){
            int[]temp=new int[8];
            
            for(int j=1;j<7;j++){
                if(cells[j-1]==cells[j+1]){
                    temp[j]=1;
                }
            }
            cells=temp;
        }
        return cells;
    }
}