// Last updated: 09/09/2026, 16:32:28
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        // int shift=0;
        // while(left<right){
        //     left>>=1;
        //     right>>=1;
        //     shift++;
        // }
        // return left<<shift;

        // DUSRI APPROACH

        while(right>left){
            right=right & (right-1);
        }
        return right;
    }
}