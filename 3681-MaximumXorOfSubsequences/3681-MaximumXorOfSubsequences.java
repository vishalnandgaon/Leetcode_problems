// Last updated: 09/09/2026, 15:58:21
class Solution {
    public int maxXorSubsequences(int[] nums) {
        int temp=nums.length;
        int[] basis=new int[32];
        for(int num:nums){
            for(int i=31;i>=0;i--){
                if(((num>>i) & 1)==0) continue;
                if(basis[i]==0){
                    basis[i]= num;
                    break;
                }
                num^=basis[i];
            }
        }
        int maxor=0;
        for(int i=31;i>=0;i--){
            maxor=Math.max(maxor,maxor^basis[i]);
        }
        return maxor;
    }
}