// Last updated: 25/09/2025, 12:25:59
class Solution {
    public int[] getConcatenation(int[] nums) {
        int times=2;
        int n=nums.length;
        int[] res=new int[2*n];
        for(int i=0;i<times;i++){
            for(int j=0;j<n;j++){
                res[i*n+j]=nums[j];
            }
        }
        return res;
    }
}