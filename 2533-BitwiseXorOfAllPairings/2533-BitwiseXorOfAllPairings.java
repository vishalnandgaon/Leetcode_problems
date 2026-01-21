// Last updated: 21/01/2026, 14:32:03
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        if(n%2==0 && m%2==0){
            return 0;
        }

        int xor1=Bitwise_xor(nums1);
        int xor2=Bitwise_xor(nums2);

        if(n%2==1 && m%2==1){
            return xor1^xor2;
        }

        else if(n%2==1){
            return xor2;
        }
        else{
            return xor1;
        }
    }
    public static int Bitwise_xor(int[] arr){
        int xor=0;
        for(int i:arr){
            xor^=i;
        }
        return xor;
    }
}