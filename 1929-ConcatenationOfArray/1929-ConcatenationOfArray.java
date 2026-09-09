// Last updated: 09/09/2026, 16:13:19
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] arr=new int[2*n];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[i+n]=nums[i];
        }

        return arr;
    }
}