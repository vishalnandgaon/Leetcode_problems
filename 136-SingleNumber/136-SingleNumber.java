// Last updated: 14/08/2025, 11:34:17
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int num: nums){
            result^=num;
        }
        return result;
    }
}