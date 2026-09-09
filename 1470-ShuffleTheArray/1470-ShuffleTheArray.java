// Last updated: 09/09/2026, 16:18:04
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l=nums.length;
        int[] ans=new int[l];
        int i=0;
        int j=n;
        int idx=0;
        while(j<l){
            ans[idx++]=nums[i];
            i++;
            ans[idx++]=nums[j];
            j++;
        }

        return ans;
    }
}