// Last updated: 09/09/2026, 16:03:25
class Solution {
    int min=Integer.MAX_VALUE;
    private int sum(int n){
        int num=0;
        while(n>0){
            num+=n%10;
            n/=10;
        }
        min=Math.min(min,num);
        return num;
    }
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            sum(nums[i]);
        }
        return min;
    }
}