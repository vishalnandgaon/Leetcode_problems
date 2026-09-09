// Last updated: 09/09/2026, 16:07:02
class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int[][] res=new int[n][m];
        int mod=12345;
        // Bhaii grid ko kardo flatten, kyuki me use krunga prefix and suffix product, but why ? kyuki ek sath sab rakhunga toh long me bhi overflow karega.

        int[] arr=new int[n*m];
        int idx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[idx++]=grid[i][j];
            }
        }

        int[] prefix=new int[m*n];
        prefix[0]=1;
        for(int i=1;i<m*n;i++){
            prefix[i]=(int)((long) prefix[i-1]*arr[i-1]%mod);
        }

        int[] suffix=new int[m*n];
        suffix[m*n-1]=1;
        for(int i=m*n-2;i>=0;i--){
            suffix[i]=(int)((long) suffix[i+1]*arr[i+1]%mod);
        }
        int a=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=(int)((long) suffix[a]*prefix[a]%mod);
                a++;
            }
        }
        return res;
    }
}