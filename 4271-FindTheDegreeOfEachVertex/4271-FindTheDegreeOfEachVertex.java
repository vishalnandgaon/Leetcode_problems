// Last updated: 13/04/2026, 20:42:57
class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n=matrix.length;
        int[] arr1=new int[n];
        int a=0;
        for(int[] arr:matrix){
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==1) count++;
            }
            arr1[a]=count;
            a++;
        }
        return arr1;
    }
}