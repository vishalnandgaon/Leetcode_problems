// Last updated: 09/09/2026, 15:55:13
class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int num:nums){
            if(num==0 && digit==0){
                count++;
            }
            while(num>0){
                if(num%10==digit) count++;
                num/=10;
            }
        }
        return count;
    }
}