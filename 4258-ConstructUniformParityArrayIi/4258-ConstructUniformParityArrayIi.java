// Last updated: 22/03/2026, 21:06:34
class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE;
        int minodd=Integer.MAX_VALUE;
        for(int num:nums1){
            min=Math.min(min,num);
            if(num%2!=0){
                minodd=Math.min(minodd,num);
            }
        }

        if(minodd==Integer.MAX_VALUE) return true;
        if(min%2!=0) return true;
        return false;
    }
}