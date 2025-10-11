// Last updated: 11/10/2025, 23:37:09
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left=0;
        int right=matrix.length-1;
        int n=matrix[0].length;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target>matrix[mid][n-1]){
                left=mid+1;
            }
            else if(target<matrix[mid][0]){
                right=mid-1;
            }
            else{
                int l=0;
                int r=n-1;
                while(l<=r){
                    int middle=l+(r-l)/2;
                    if(target>matrix[mid][middle]){
                        l=middle+1;
                    }
                    else if(target<matrix[mid][middle]){
                        r=middle-1;
                    }
                    else{
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}