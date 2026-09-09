// Last updated: 09/09/2026, 15:56:22
class Solution {
    public int scoreDifference(int[] nums) {
        int n=nums.length;
        if(n==1 && nums[0]%2==0) return nums[0]; 
        if(n==1 && nums[0]%2!=0) return nums[0]*(-1);

        int count1=0;
        int count2=0;
        boolean flag=true;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0 && (i+1)%6==0){
                if(flag){
                    flag=false;
                }
                else{
                    flag=true;
                }
            }
            else if(nums[i]%2!=0 && (i+1)%6!=0){
                if(flag){
                    flag=false;
                }
                else{
                    flag=true;
                }
            }
            if(flag==true){
                count1+=nums[i];
            }
            else{
                count2+=nums[i];
            }
        }
        return count1-count2;
    }
}