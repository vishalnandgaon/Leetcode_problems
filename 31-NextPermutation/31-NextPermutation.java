// Last updated: 14/08/2025, 11:35:20
class Solution {
    public void nextPermutation(int[] nums) {
        int n= nums.length;
        int breakPoint=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                breakPoint=i;
                break;
            }
        }
        if(breakPoint==-1){
            reverse(nums,0,n-1);
            return;
        }
        int q=-1;
        for(int j=n-1;j>breakPoint;j--){
            if(nums[j]>nums[breakPoint]){
                q=j;
                break;
            }
        }
        int temp=nums[breakPoint];
        nums[breakPoint]=nums[q];
        nums[q]=temp;
        reverse(nums,breakPoint+1,n-1);
    }
    public static void reverse(int[] nums,int si,int ei){
        int i=si;
        int j=ei;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}