// Last updated: 12/01/2026, 22:47:55
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