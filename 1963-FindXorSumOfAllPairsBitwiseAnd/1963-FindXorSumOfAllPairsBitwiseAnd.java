// Last updated: 21/01/2026, 14:32:42
class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int xor1=BitwiseXor(arr1);
        int xor2=BitwiseXor(arr2);
        return xor1 & xor2;
    }
    public int BitwiseXor(int[] arr){
        int xor=0;
        for(int i:arr){
            xor^=i;
        }
        return xor;
    }
}