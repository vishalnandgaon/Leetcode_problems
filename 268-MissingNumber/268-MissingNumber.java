// Last updated: 14/08/2025, 11:33:48
class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> ht= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            ht.add(nums[i]);
        }
        int i=0;
        while(i<=nums.length){
            if(ht.contains(i)){
                i++;
            }
            else{
                return i;
            }
        }
        return i;
    }
}